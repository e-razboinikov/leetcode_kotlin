package running_sum_of_1d_array_1480


import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    private val instance = Solution()

    @Test
    fun test1() {
        assertArrayEquals(intArrayOf(1, 3, 6, 10), instance.runningSum(intArrayOf(1, 2, 3, 4)))
    }

    @Test
    fun test2() {
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), instance.runningSum(intArrayOf(1, 1, 1, 1, 1)))
    }

    @Test
    fun test3() {
        assertArrayEquals(intArrayOf(3, 4, 6, 16, 17), instance.runningSum(intArrayOf(3, 1, 2, 10, 1)))
    }
}