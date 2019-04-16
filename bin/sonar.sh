#!/bin/bash

set -ue

mvn sonar:sonar \
  -Dsonar.projectKey=test \
  -Dsonar.host.url=http://140.143.250.99:8888 \
  -Dsonar.login=1a7fb66d31bcce4518c72dd92132f16d19f53004