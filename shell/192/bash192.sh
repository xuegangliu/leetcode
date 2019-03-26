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

#### tr ' ' '\n'  #1.将所有的空格转换为换行符
#### tr -s '\n'   #2.将重复出现的换行符只保留1个
#### uniq -c      #3.统计单词出现的次数
#### sort -rn     #4.对次数进行排序
#### awk'{print $2" "$1}' #5.按指定位置输出

