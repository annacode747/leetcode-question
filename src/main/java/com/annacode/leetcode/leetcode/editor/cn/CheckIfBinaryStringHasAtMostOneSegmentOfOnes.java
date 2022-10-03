/**
<p>给你一个二进制字符串 <code>s</code> ，该字符串 <strong>不含前导零</strong> 。</p>

<p>如果 <code>s</code> 包含 <strong>零个或一个由连续的 <code>'1'</code> 组成的字段</strong> ，返回 <code>true</code>​​​ 。否则，返回 <code>false</code> 。</p>

<p>如果 <code>s</code>&nbsp;中&nbsp;<strong>由连续若干个&nbsp;<code>'1'</code> 组成的字段</strong>&nbsp;数量不超过 <code>1</code>，返回 <code>true</code>​​​ 。否则，返回 <code>false</code> 。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<strong>输入：</strong>s = "1001"
<strong>输出：</strong>false
<strong>解释：</strong>由连续若干个&nbsp;<span><code>'1'</code></span> 组成的字段数量为 2，返回 false
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<strong>输入：</strong>s = "110"
<strong>输出：</strong>true</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>1 &lt;= s.length &lt;= 100</code></li> 
 <li><code>s[i]</code>​​​​ 为 <code>'0'</code> 或 <code>'1'</code></li> 
 <li><code>s[0]</code> 为 <code>'1'</code></li> 
</ul>

<div><div>Related Topics</div><div><li>字符串</li></div></div><br><div><li>👍 40</li><li>👎 0</li></div>
*/

package com.annacode.leetcode.leetcode.editor.cn;
public class CheckIfBinaryStringHasAtMostOneSegmentOfOnes{
  public static void main(String[] args) {
       Solution solution = new CheckIfBinaryStringHasAtMostOneSegmentOfOnes().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean checkOnesSegment(String s) {
            if (s.length()<=1)
                return true;
            if (s.contains("01"))
                return false;
            return true;
        }
    }
    /*
    解答成功:
	执行耗时:0 ms,击败了100.00% 的Java用户
	内存消耗:39.4 MB,击败了71.33% 的Java用户
     */
//leetcode submit region end(Prohibit modification and deletion)

}