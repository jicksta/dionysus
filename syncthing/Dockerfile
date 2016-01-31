FROM ubuntu

COPY syncthing-release-pgp-key.txt /tmp/syncthing-release-pgp-key.txt
RUN apt-key add /tmp/syncthing-release-pgp-key.txt

RUN echo "deb http://apt.syncthing.net/ syncthing release" > /etc/apt/sources.list
RUN apt-get update && apt-get install -y syncthing

