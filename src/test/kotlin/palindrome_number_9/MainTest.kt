package palindrome_number_9

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MainTest {
    private val instance = Solution()

    @Test
    fun test1() {
        assertEquals(true, instance.isPalindrome(121))
    }

    @Test
    fun test2() {
        assertEquals(false, instance.isPalindrome(-121))
    }

    @Test
    fun test3() {
        assertEquals(false, instance.isPalindrome(10))
    }
}