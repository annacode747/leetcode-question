/**
<p>编写一种算法，若M × N矩阵中某个元素为0，则将其所在的行与列清零。</p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
<strong>输出：</strong>
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
</pre>

<p><strong>示例 2：</strong></p>

<pre><strong>输入：</strong>
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
<strong>输出：</strong>
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
</pre>

<div><div>Related Topics</div><div><li>数组</li><li>哈希表</li><li>矩阵</li></div></div><br><div><li>👍 119</li><li>👎 0</li></div>
*/

package com.annacode.leetcode.leetcode.editor.cn;

import java.util.HashMap;

public class ZeroMatrixLcci{
  public static void main(String[] args) {
       Solution solution = new ZeroMatrixLcci().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer,Integer> x = new HashMap<>();
        HashMap<Integer,Integer> y = new HashMap<>();
        for (int i = 0 ; i < matrix.length ; i++){
            for (int o = 0 ; o < matrix[i].length ;  o++){
                if (matrix[i][o] == 0){
                    x.put(i,i);
                    y.put(o,o);
                }
            }
        }
        for (Integer key: x.keySet()) {
            for (int i = 0 ; i < matrix[0].length ; i++){
                matrix[key][i] = 0;
            }
        }
        for (Integer key: y.keySet()) {
            for (int i = 0 ; i < matrix.length ; i++){
                matrix[i][key] = 0;
            }
        }
    }
    /*
解答成功:
	执行耗时:1 ms,击败了43.70% 的Java用户
	内存消耗:42.8 MB,击败了86.62% 的Java用户
     */
}
//leetcode submit region end(Prohibit modification and deletion)

}