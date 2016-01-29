#!/bin/sh

MICRO=$(dirname $(readlink -f $0))

npm start &
