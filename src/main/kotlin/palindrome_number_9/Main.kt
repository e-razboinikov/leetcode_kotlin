package palindrome_number_9

// First solution, comes to mind
class Solution1 {
    fun isPalindrome(x: Int): Boolean =
        x.toString().reversed() == x.toString()
}

// Solution from Leetcode
class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false
        }

        var copiedNumber = x
        var revertedNumber = 0

        while (copiedNumber > revertedNumber) {
            revertedNumber = revertedNumber * 10 + copiedNumber % 10
            copiedNumber /= 10
        }

        return copiedNumber == revertedNumber || copiedNumber == revertedNumber / 10
    }
}