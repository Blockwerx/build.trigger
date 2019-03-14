#!/bin/bash

#clear exited containers
`docker rm  $(docker ps -f status=exited -aq)` || true;

#clear dangling images
`docker rmi  $(docker images -f dangling=true -aq)` || true;

#clear voulme
docker volume prune -f;

# clear workspace
ls /var/lib/jenkins/workspace/;
rm -rf /var/lib/jenkins/workspace/;