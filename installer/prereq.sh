#!/bin/bash
set -e

sudo apt-get -y update || exit 0
sudo apt-get -y upgrade || exit 0
sudo apt-get -y install gedit gradle git terminator gradle default-jdk git-flow ack-grep vim default-jdk || exit 0 

