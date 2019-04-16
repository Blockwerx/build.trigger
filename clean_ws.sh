#!/bin/bash

#clear exited containers
docker ps -f status=exited -aq
`docker rm  $(docker ps -f status=exited -aq)` || true;

#clear dangling images
docker images -f dangling=true -aq
`docker rmi  $(docker images -f dangling=true -aq)` || true;

#clear voulme
docker volume prune -f;

# clear workspace
ls /var/lib/jenkins/workspace/BuildSam** /var/lib/jenkins/workspace/**feature/**; 
rm -rf /var/lib/jenkins/workspace/BuildSam** /var/lib/jenkins/workspace/**feature/**;