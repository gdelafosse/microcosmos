#!/bin/sh

MICROGO=$(dirname $(readlink -f $0))
export GOPATH=$GOPATH:$MICROGO

go install microgo
