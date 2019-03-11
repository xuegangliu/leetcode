#!/bin/bash

# BEGIN {awk-commands}
# /pattern/ {awk-commands}
# END {awk-commands}

set -ue

# 
#awk -f command.awk marks.txt

#awk 'BEGIN{printf "Sr No\tName\tSub\tMarks\n"} {print}' marks.txt

# formatter
awk --profile 'BEGIN{printf"---|Header|--\n"} {print} END{printf"---|Footer|---\n"}' marks.txt > /dev/null 
