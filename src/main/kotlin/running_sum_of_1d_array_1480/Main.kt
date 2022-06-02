package running_sum_of_1d_array_1480

// My solution
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in nums.indices) {
            if (i == 0) {
                result.add(i, nums[0])
            } else {
                result.add(i, result[i - 1] + nums[i])
            }
        }
        return result.toIntArray()
    }
}