/**
<p>字符串轮转。给定两个字符串<code>s1</code>和<code>s2</code>，请编写代码检查<code>s2</code>是否为<code>s1</code>旋转而成（比如，<code>waterbottle</code>是<code>erbottlewat</code>旋转后的字符串）。</p>

<p><strong>示例1:</strong></p>

<pre><strong> 输入</strong>：s1 = "waterbottle", s2 = "erbottlewat"
<strong> 输出</strong>：True
</pre>

<p><strong>示例2:</strong></p>

<pre><strong> 输入</strong>：s1 = "aa", s2 = "aba"
<strong> 输出</strong>：False
</pre>

<ol> 
</ol>

<p><strong>提示：</strong></p>

<ol> 
 <li>字符串长度在[0, 100000]范围内。</li> 
</ol>

<p><strong>说明:</strong></p>

<ol> 
 <li>你能只调用一次检查子串的方法吗？</li> 
</ol>

<div><div>Related Topics</div><div><li>字符串</li><li>字符串匹配</li></div></div><br><div><li>👍 181</li><li>👎 0</li></div>
*/

package com.annacode.leetcode.leetcode.editor.cn;

import java.util.HashMap;

public class StringRotationLcci{
  public static void main(String[] args) {
       Solution solution = new StringRotationLcci().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isFlipedString(String s1, String s2) {
        return (s1.length() == s2.length()) && (s1+s1).contains(s2);
    }
    /*
    执行耗时:0 ms,击败了100.00% 的Java用户
	内存消耗:41.4 MB,击败了66.41% 的Java用户
     */
}
//leetcode submit region end(Prohibit modification and deletion)

}