package crosswordsads

import org.junit.Test
import kotlin.test.assertEquals

class MyTestCase() {

    @Test
    fun shouldCreateChains() {
        val words = Words.fromFile("dictionary/slownik")
        val board = Board(listOf("h", "z", "r", "a", "i", "o", "l", "i", "w", "e", "r", "a", "t", "s", "w", "t"))

        val slowa = (0..15).flatMap { fromStartingPoint(listOf(it), board, words) }
        assertEquals(148, slowa.size)
    }

}


