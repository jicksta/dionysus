require 'leveldb'
require 'pinboard'

WORKER_NAME = "dionysus-db-pinboard"
USERNAME, API_TOKEN = YAML.load_file('secrets.yml').values_at "username", "auth_token"

DB = LevelDB::DB.new "/data/#{WORKER_NAME}.leveldb"

POSTS = Pinboard::Client.new(token: API_TOKEN).posts

class Pinboard::Post # Monkey patch in yo' face!
  def arachne_key(property)
    "db.pinboard.#{formatted_date}.#{property}"
  end
  private
  def formatted_date
    time.to_i.to_s
  end
end

POSTS.each do |post|
  DB.batch do |batch|
    batch.put(post.arachne_key('href'), post.href)
    batch.put(post.arachne_key('description'), post.description)
    batch.put(post.arachne_key('extended'), post.extended)
    batch.put(post.arachne_key('toread'), post.toread ? 'true' : 'false')
    post.tag.each.with_index do |tag, index|
      batch.put(post.arachne_key("tag.#{index}"), tag)
    end
    batch.put(post.arachne_key("meta.time"), Time.now.httpdate)
  end
end

DB.close # fsync
