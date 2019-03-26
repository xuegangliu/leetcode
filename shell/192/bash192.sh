#!/bin/bash
#+++++++++++++++++
# @Desc: 192 统计词频
# @author: xuegangliu
# @date: 20190305
#+++++++++++++++++

set -ue

# 方式1
# tr\sort\uniq\awk命令使用
cat file192.txt|tr ' ' '\n'|tr -s '\n'|sort -|uniq -c|sort -rn|awk '{print$2" "$1}'


# 获取内容
#content=`cat file192.txt`
#echo $content

#这里是将var中的,替换为空格
#echo ${content//'  '/ }

#tt=${content//'  '/ }

#echo $tt|awk -F "[: ]+" '{print $1}'
