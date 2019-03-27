# 思路：
# 把每一行每一列的值放到数组中拼接起来而已
{
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
}
