#!/bin/bash
for i in {1..2899}
do
   cat page_$i | grep "</a></td>"
done
