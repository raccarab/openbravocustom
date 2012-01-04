#!/bin/sh

cd . #WRITE HERE THE FULL PATH TO THIS SCRIPT

count=0
while true; do
	if [ $(ps | grep print.sh | wc -l) -gt 3 ];
	then
		count=$((count+1))
		
		echo ' already running !';
		sleep 5
		if [ $count -gt 10 ];
		then
			exit
		fi
	else 
		break
	fi
done

fname=ticket.txt
pname=wip.txt
target=completed.txt
cutline='-----*CUT*-----'

rm $target

while true; do
	if [ -f $fname ]
	then	
	   mv $fname $pname
	   exec<$pname
	   while read line
	   do
		if [ "$line" = "$cutline" ];
		then
			cat cutreceipt >> $target
		else
		   `echo $line >> $target`
		fi
	   done
	   rm $pname
	fi
	sleep 3
done  
  