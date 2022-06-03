package transpose_matrix_867

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertArrayEquals

internal class MainTest {
    private val instance = Solution()

    private val testCases: Map<Array<IntArray>, Array<IntArray>> = mapOf(
        arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9)) to arrayOf(
            intArrayOf(1, 4, 7),
            intArrayOf(2, 5, 8),
            intArrayOf(3, 6, 9)
        ),
        arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6)) to arrayOf(
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(3, 6)
        )
    )

    @Test
    fun test() {
        testCases.forEach { (k, v) ->
            assertArrayEquals(v, instance.transpose(k))
        }
    }
}