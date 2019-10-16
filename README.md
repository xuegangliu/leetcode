# leetcode
---
#### 网址

- [leetcode中文](https://leetcode-cn.com/problemset/all/)
- [leetcode](https://leetcode.com/)

#### 实现方式

- java
- python

#### 其它

- database
- shell


## 插件
- IDEA插件[leetcode]
```
codefilename:
P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})

codetemp:
${question.content}

package leetcode.editor.cn;
//Java：${question.title}
public class P${question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug}){
    public static void main(String[] args) {
        Solution solution = new P$!{question.frontendQuestionId}$!velocityTool.camelCaseName(${question.titleSlug})().new Solution();
        // TO TEST
    }
    ${question.code}
}

temp:
${question.title}	题目标题	示例:两数之和
${question.titleSlug}	题目标记	示例:two-sum
${question.frontendQuestionId}	题目编号
${question.content}	题目描述
${question.code}	题目代码
$!velocityTool.camelCaseName(str)	转换字符为驼峰样式
```