package roman_to_integer_13

import junit.framework.TestCase

class RomanToIntegerKtTest : TestCase() {
    val instance = Solution()

    fun test3() {
        assertEquals(3, instance.romanToInt("III"))
    }

    fun test58() {
        assertEquals(58, instance.romanToInt("LVIII"))
    }

    fun test1994() {
        assertEquals(1994, instance.romanToInt("MCMXCIV"))
    }
}