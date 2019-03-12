#!/bin/bash
#+++++++++++++++++++++++++++
# @Desc: 193. 有效电话号码
# @author: xuegangliu
# @date: 20190311
#+++++++++++++++++++++++++++

set -ue
awk '/^[0-9]{3}-[0-9]{3}-[0-9]{4}$/ || /^\([0-9]{3}\) [0-9]{3}-[0-9]{4}$/ ' phone.txt