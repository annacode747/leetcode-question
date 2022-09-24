package com.annacode.leetcode.leetcode.editor.cn;

/**
<p>你有一个炸弹需要拆除，时间紧迫！你的情报员会给你一个长度为&nbsp;<code>n</code>&nbsp;的&nbsp;<strong>循环</strong>&nbsp;数组&nbsp;<code>code</code>&nbsp;以及一个密钥&nbsp;<code>k</code>&nbsp;。</p>

<p>为了获得正确的密码，你需要替换掉每一个数字。所有数字会&nbsp;<strong>同时</strong>&nbsp;被替换。</p>

<ul> 
 <li>如果&nbsp;<code>k &gt; 0</code>&nbsp;，将第&nbsp;<code>i</code>&nbsp;个数字用 <strong>接下来</strong>&nbsp;<code>k</code>&nbsp;个数字之和替换。</li> 
 <li>如果&nbsp;<code>k &lt; 0</code>&nbsp;，将第&nbsp;<code>i</code>&nbsp;个数字用 <strong>之前</strong>&nbsp;<code>k</code>&nbsp;个数字之和替换。</li> 
 <li>如果&nbsp;<code>k == 0</code>&nbsp;，将第&nbsp;<code>i</code>&nbsp;个数字用&nbsp;<code>0</code>&nbsp;替换。</li> 
</ul>

<p>由于&nbsp;<code>code</code>&nbsp;是循环的，&nbsp;<code>code[n-1]</code>&nbsp;下一个元素是&nbsp;<code>code[0]</code>&nbsp;，且&nbsp;<code>code[0]</code>&nbsp;前一个元素是&nbsp;<code>code[n-1]</code>&nbsp;。</p>

<p>给你 <strong>循环</strong>&nbsp;数组&nbsp;<code>code</code>&nbsp;和整数密钥&nbsp;<code>k</code>&nbsp;，请你返回解密后的结果来拆除炸弹！</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre>
<b>输入：</b>code = [5,7,1,4], k = 3
<b>输出：</b>[12,10,16,13]
<b>解释：</b>每个数字都被接下来 3 个数字之和替换。解密后的密码为 [7+1+4, 1+4+5, 4+5+7, 5+7+1]。注意到数组是循环连接的。
</pre>

<p><strong>示例 2：</strong></p>

<pre>
<b>输入：</b>code = [1,2,3,4], k = 0
<b>输出：</b>[0,0,0,0]
<b>解释：</b>当 k 为 0 时，所有数字都被 0 替换。
</pre>

<p><strong>示例 3：</strong></p>

<pre>
<b>输入：</b>code = [2,4,9,3], k = -2
<b>输出：</b>[12,5,6,13]
<b>解释：</b>解密后的密码为 [3+9, 2+3, 4+2, 9+4] 。注意到数组是循环连接的。如果 k 是负数，那么和为 <strong>之前</strong> 的数字。
</pre>

<p>&nbsp;</p>

<p><strong>提示：</strong></p>

<ul> 
 <li><code>n == code.length</code></li> 
 <li><code>1 &lt;= n&nbsp;&lt;= 100</code></li> 
 <li><code>1 &lt;= code[i] &lt;= 100</code></li> 
 <li><code>-(n - 1) &lt;= k &lt;= n - 1</code></li> 
</ul>

<div><div>Related Topics</div><div><li>数组</li></div></div><br><div><li>👍 66</li><li>👎 0</li></div>
*/

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decrypt(int[] code, int k) {
        return code;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
