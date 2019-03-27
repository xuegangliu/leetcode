基础shell
---

#### tr
```bash
tr [选项]… 集合1 [集合2]
 
选项说明：
 
-c, -C, –complement 用集合1中的字符串替换，要求字符集为ASCII。
 
-d, –delete 删除集合1中的字符而不是转换
 
-s, –squeeze-repeats 删除所有重复出现字符序列，只保留第一个；即将重复出现字符串压缩为一个字符串。
 
-t, –truncate-set1 先删除第一字符集较第二字符集多出的字符
 
字符集合的范围：
 
\NNN 八进制值的字符 NNN (1 to 3 为八进制值的字符)
\\ 反斜杠
\a Ctrl-G 铃声
\b Ctrl-H 退格符
\f Ctrl-L 走行换页
\n Ctrl-J 新行
\r Ctrl-M 回车
\t Ctrl-I tab键
\v Ctrl-X 水平制表符
CHAR1-CHAR2 从CHAR1 到 CHAR2的所有字符按照ASCII字符的顺序
[CHAR*] in SET2, copies of CHAR until length of SET1
[CHAR*REPEAT] REPEAT copies of CHAR, REPEAT octal if starting with 0
[:alnum:] 所有的字母和数字
[:alpha:] 所有字母
[:blank:] 水平制表符，空白等
[:cntrl:] 所有控制字符
[:digit:] 所有的数字
[:graph:] 所有可打印字符，不包括空格
[:lower:] 所有的小写字符
[:print:] 所有可打印字符，包括空格
[:punct:] 所有的标点字符
[:space:] 所有的横向或纵向的空白
[:upper:] 所有大写字母
```


#### sort
```bash
参　　数：
  -b   忽略每行前面开始出的空格字符。
  -c   检查文件是否已经按照顺序排序。
  -d   排序时，处理英文字母、数字及空格字符外，忽略其他的字符。
  -f   排序时，将小写字母视为大写字母。
  -i   排序时，除了040至176之间的ASCII字符外，忽略其他的字符。
  -m   将几个排序好的文件进行合并。
  -M   将前面3个字母依照月份的缩写进行排序。
  -n   依照数值的大小排序。
  -o<输出文件>   将排序后的结果存入指定的文件。
  -r   以相反的顺序来排序。
  -t<分隔字符>   指定排序时所用的栏位分隔字符。
  +<起始栏位>-<结束栏位>   以指定的栏位来排序，范围由起始栏位到结束栏位的前一栏位。
  --help   显示帮助。
  --version   显示版本信息
```

#### uniq
```bash
用法：uniq [选项]... [文件]
从输入文件或者标准输入中筛选相邻的匹配行并写入到输出文件或标准输出。
 
不附加任何选项时匹配行将在首次出现处被合并。
 
长选项必须使用的参数对于短选项时也是必需使用的。
  -c, --count           在每行前加上表示相应行目出现次数的前缀编号
  -d, --repeated        只输出重复的行
  -D, --all-repeated[=delimit-method    显示所有重复的行
                        delimit-method={none(default),prepend,separate}
                        以空行为界限
  -f, --skip-fields=N   比较时跳过前N 列
  -i, --ignore-case     在比较的时候不区分大小写
  -s, --skip-chars=N    比较时跳过前N 个字符
  -u, --unique          只显示唯一的行
  -z, --zero-terminated 使用'\0'作为行结束符，而不是新换行
  -w, --check-chars=N   对每行第N 个字符以后的内容不作对照
      --help            显示此帮助信息并退出
      --version         显示版本信息并退出
 
若域中为先空字符(通常包括空格以及制表符)，然后非空字符，域中字符前的空字符将被跳过。
 
提示：uniq 不会检查重复的行，除非它们是相邻的行。
如果您想先对输入排序，使用没有uniq 的"sort -u"。
```

#### xargs
将命令的结果作为参数传递给另一个命令

#### blog
- [tr](https://www.cnblogs.com/ginvip/p/6354440.html ':target=_blank')
- [sort](https://www.cnblogs.com/fulucky/p/8022718.html ':target=_blank')
- [uniq](https://www.cnblogs.com/ftl1012/p/uniq.html ':target=_blank')

