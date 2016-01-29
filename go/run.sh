#!/bin/sh

MICROGO=$(dirname $(readlink -f $0))

$MICROGO/bin/microgo &
