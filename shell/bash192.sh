#!/bin/bash

# 192. 统计词频

set -ue

# 获取内容
content=`cat words.txt`

echo $content

#这里是将var中的,替换为空格
echo ${content//'  '/ }

tt=${content//'  '/ }

echo $tt|awk -F "[: ]+" '{print $1}'