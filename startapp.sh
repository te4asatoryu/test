#!/bin/sh
chmod +x /tmp/startSpringapp.sh
systemctl daemon-reload
systemctl restart springapp.service
java -jar /tmp/demo-0.0.1-SNAPSHOT.jar
