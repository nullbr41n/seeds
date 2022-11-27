#!/bin/bash


function chkInput
                {
                if [ -z "$1" ];then
                displayUsage
                exit 0;
                fi
                }

function displayUsage
                {
                echo "Usages /bin/bash blackhole --allow 212.212.212.212 Or --deny 212.212.212.212"
                }



chkInput $1



case $i in
        *DENY*)
         echo "ip route add blackhole $1"
                 
        ;;
        *ALLOW*)
                 echo "ip route del $1"
        ;;
esac
