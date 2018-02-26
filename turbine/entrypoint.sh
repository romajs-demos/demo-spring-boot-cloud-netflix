#!/bin/sh
while ! nc -z eureka-server 8761 ; do
    echo "Waiting for upcoming eureka-server"
    sleep 2
done
java -jar /turbine.jar