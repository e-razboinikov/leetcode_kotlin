package roman_to_integer_13

import junit.framework.TestCase

class MainTest : TestCase() {
    private val instance = Solution()

    fun test1() {
        assertEquals(3, instance.romanToInt("III"))
    }

    fun test2() {
        assertEquals(58, instance.romanToInt("LVIII"))
    }

    fun test3() {
        assertEquals(1994, instance.romanToInt("MCMXCIV"))
    }
}