FROM ruby
RUN apt-get update && apt-get install -y leveldb
RUN mkdir /data
COPY Gemfile Gemfile
RUN bundle install

COPY secrets.yml secrets.yml
COPY main.rb main.rb

VOLUME /data/dionysus-db-pinboard

CMD ruby main.rb
