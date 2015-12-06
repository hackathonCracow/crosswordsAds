#!/bin/bash
for i in {1..2899}
do
   cat page_$i | grep "</a></td>" | cut -d"=" -f2 | cut -d'>' -f2 | cut -d "<" -f1
done
