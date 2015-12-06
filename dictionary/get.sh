#!/bin/bash
for i in {1..2899}
do
   echo "Welcome $i times"
   wget -q -S -O page_$i http://sjp.pl/slownik/lp.phtml?f_vl=2&page=$i
done
