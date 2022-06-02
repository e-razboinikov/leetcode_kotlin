package two_sum_1

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

internal class MainTest {
    private val instance = Solution()

    @Test
    fun test1() {
        assertArrayEquals(intArrayOf(0, 1), instance.twoSum(intArrayOf(2, 7, 11, 15), 9))
    }

    @Test
    fun test2() {
        assertArrayEquals(intArrayOf(1, 2), instance.twoSum(intArrayOf(3, 2, 4), 6))
    }

    @Test
    fun test3() {
        assertArrayEquals(intArrayOf(0, 1), instance.twoSum(intArrayOf(3, 3), 6))
    }

    @Test
    fun test4() {
        assertArrayEquals(intArrayOf(0, 3), instance.twoSum(intArrayOf(0, 4, 3, 0), 0))
    }
}