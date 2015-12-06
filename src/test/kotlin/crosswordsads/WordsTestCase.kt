package crosswordsads

import org.junit.Test

class WordsTestCase {

    @Test
    fun shouldReturnFalseFalseWhenWordDoesNotExists() {
        val (exists, startsWith) = Words(listOf("a")).find("b")
        assert(!exists)
        assert(!startsWith)
    }

    @Test
    fun shouldReturnFalseTrueIfWordStartsWith() {
        val (exists, startsWith) = Words(listOf("c", "ab", "ab", "ab", "ab", "ab")).find("a")
        assert(!exists)
        assert(startsWith)
    }

    @Test
    fun shouldReturnTrueTrueIfWordStartsWithAndExists() {
        val (exists, startsWith) = Words(listOf("ab", "a")).find("a")
        assert(exists)
        assert(startsWith)
    }
}