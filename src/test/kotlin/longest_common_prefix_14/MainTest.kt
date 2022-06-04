package longest_common_prefix_14

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class MainTest {
    private val instance = Solution()

    @Test
    fun test1() {
        assertEquals("fl", instance.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun test2() {
        assertEquals("", instance.longestCommonPrefix(arrayOf("dog", "racecar", "car")))
    }
}