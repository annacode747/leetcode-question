/**
<p>只有满足下面几点之一，括号字符串才是有效的：</p>

<ul> 
 <li>它是一个空字符串，或者</li> 
 <li>它可以被写成&nbsp;<code>AB</code>&nbsp;（<code>A</code>&nbsp;与&nbsp;<code>B</code>&nbsp;连接）, 其中&nbsp;<code>A</code> 和&nbsp;<code>B</code>&nbsp;都是有效字符串，或者</li> 
 <li>它可以被写作&nbsp;<code>(A)</code>，其中&nbsp;<code>A</code>&nbsp;是有效字符串。</li> 
</ul>

<p>给定一个括号字符串 <code>s</code> ，移动N次，你就可以在字符串的任何位置插入一个括号。</p>

<ul> 
 <li>例如，如果 <code>s = "()))"</code> ，你可以插入一个开始括号为 <code>"(()))"</code> 或结束括号为 <code>"())))"</code> 。</li> 
</ul>

<p>返回 <em>为使结果字符串 <code>s</code> 有效而必须添加的最少括号数</em>。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "())"
<strong>输出：</strong>1
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "((("
<strong>输出：</strong>3
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 1000</code></li> 
 <li><code>s</code> 只包含&nbsp;<code>'('</code> 和&nbsp;<code>')'</code>&nbsp;字符。</li> 
</ul>

<div><div>Related Topics</div><div><li>栈</li><li>贪心</li><li>字符串</li></div></div><br><div><li>👍 218</li><li>👎 0</li></div>
*/

package com.annacode.leetcode.editor.cn;

public class MinimumAddToMakeParenthesesValid{
    public static void main(String[] args) {
       Solution solution = new MinimumAddToMakeParenthesesValid().new Solution();
    }
  //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int findStrCount(String oriStr, String findStr, int count) {
            if (oriStr.contains(findStr)) {
                count++;
                count = findStrCount(oriStr.substring(oriStr.indexOf(findStr) + findStr.length()), findStr, count);
            }
            return count;
        }
        public String Remove(String ss ,String s){
            if (ss.contains(s.replace("\\",""))){
                String r = "";
                for (String i:ss.split(s)) {
                    r += i;
                }
                ss = Remove(r,s);
            }
            return ss;
        }
        public int minAddToMakeValid(String s) {
            s =Remove(s,"\\(\\)");
            System.out.println(s);
            int i = findStrCount(s,")(",0)*2;
            for (String a:s.split("\\)\\(")) {
                i+=a.length();
            }
            return i;
        }
        /*
        解答成功:
	执行耗时:9 ms,击败了11.82% 的Java用户
	内存消耗:42 MB,击败了5.08% 的Java用户
         */

    }

//leetcode submit region end(Prohibit modification and deletion)

}