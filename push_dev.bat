:: @echo off 表示不回显执行的命令
@echo off
:: 设置变量，使用变量时需要用一对%包起来  
set ORIGINAL_DATE=%date%
set CURRENT_DATE_TIME=%time:~0,2%:%time:~3,2%:%time:~6,2%
echo %ORIGINAL_DATE% %CURRENT_DATE_TIME%