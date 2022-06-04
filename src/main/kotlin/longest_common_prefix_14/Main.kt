package longest_common_prefix_14

// My solution
class Solution1 {
    fun longestCommonPrefix(strings: Array<String>): String {
        var result = ""

        var smallest: String = strings[0]
        for (i in 1 until strings.size) {
            if (strings[i].length < smallest.length) {
                smallest = strings[i]
            }
        }

        for (i in smallest.indices) {
            val currentLatter = strings[0][i]

            for (string in strings) {
                if (string[i] != currentLatter) {
                    return result
                }
            }

            result += currentLatter
        }

        return result
    }
}

// Solution from leetcode
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size) while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
        return prefix
    }
}