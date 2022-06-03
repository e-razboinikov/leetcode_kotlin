package transpose_matrix_867

class Solution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray> {
        val rows = matrix.size
        val columns = matrix[0].size

        val ans = Array(columns) { IntArray(rows) }

        for (r in 0 until rows) for (c in 0 until columns) {
            ans[c][r] = matrix[r][c]
        }
        return ans
    }
}
