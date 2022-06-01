package roman_to_integer_13

class Solution1 {
    fun romanToInt(s: String): Int {
        var result = 0
        var copiedString: String = s
        val valuesMap = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )
        val subtractions = mapOf(
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900
        )
        for (key in subtractions.keys) {
            if (copiedString.contains(key)) {
                result += subtractions[key]!!
                copiedString = copiedString.replace(key, "")
            }
        }
        copiedString.forEach { e -> result += valuesMap["$e"]!! }
        return result
    }
}

class Solution {
    fun romanToInt(s: String): Int {
        var result = 0

        val valuesMap = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000)

        for(i in s.indices) {
            val currentChar: String = s[i].toString()
            val nextChar = if(i + 1 < s.length) s[i + 1].toString() else  null
            if (i < s.length - 1 && valuesMap[currentChar]!! < valuesMap[nextChar]!!) {
                result -= valuesMap[currentChar]!!
            } else {
                result += valuesMap[currentChar]!!
            }
        }

        return result
    }
}