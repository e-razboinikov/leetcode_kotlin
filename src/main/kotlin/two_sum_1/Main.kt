package two_sum_1

// My first solution
class Solution1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableListOf<Int>()

        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] + nums[j] == target && i != j) {
                    result.add(i)
                    result.add(j)
                    return result.sorted().toIntArray()
                }
            }
        }

        return result.sorted().toIntArray()
    }
}

// Solution from discuss
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result = mutableListOf<Int>()
        val map = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            if (map.containsKey(target - nums[i])) {
                result.add(map[target - nums[i]]!!)
                result.add(i)
                return result.sorted().toIntArray()
            }
            map[nums[i]] = i
        }

        return result.sorted().toIntArray()
    }
}