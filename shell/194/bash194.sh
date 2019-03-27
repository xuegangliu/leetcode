#!/bin/bash
#+++++++++++++++++
# @Desc: 194转置文件
# @author: xuegangliu
# @date: 20190315
#+++++++++++++++++
set -ue

awk '{
    for (i=1; i<=NF; i++) {
        # 为了格式化输出的空格
        if (NR==1) {
            res[i]=$i
        } else {
            res[i]=res[i] " " $i
        }
    }
}
END {
    for (i=1; i<=NF; i++) {
        print res[i]
    }
}' file194.txt
