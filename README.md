Dionysus
========

At this stage, Dionysus is a personal project of mine to create a decentralized
personal cloud.

Dionysus is a combination of several other technologies:

 * [Arachne](https://github.com/neighborly/arachne): Docker-based data fetching and management architecture
 * [Ganymede](https://github.com/jicksta/ganymede): A modular application development framework built with Elm + Electron
 * [TankerPop](https://github.com/jicksta/tankerpop): Toolkit for dealing with graph databases
 * ... and a few others

Dionysus builds Docker images which do background work, service API requests, or
present an interface.

Dionysus Data
-------------

Dionysus uses Arachne's LevelDB-based data architecture with a custom reducer that
constructs a graph database for interfaces to query.

The graph database system is based on [TankerPop](https://github.com/jicksta/tankerpop), a graph database laboratory built atop Docker Compose.

Dionysus Interface
------------------

Dionysus uses Ganymede to render an interface for viewing and managing data. CSS is based on the Bulma CSS framework.

Installation
------------

Dionysus isn't ready for others to use at the moment.

You will soon be able to install and manage your own personal Dionysus system using only Kitematic. In the distant future, a replacement for Kitematic will also be developed that is specifically built to manage Dionysus containers, data replication preferences, etc.

