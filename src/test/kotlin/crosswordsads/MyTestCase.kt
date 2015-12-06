package crosswordsads

import crosswordsads.kasper.MyWords
import crosswordsads.kasper.realWords
import org.junit.Test
import kotlin.test.assertEquals

class MyTestCase() {

    @Test
    fun shouldCreateChains() {
        val words = MyWords.fromFile("dictionary/slownik")
        val board = Board(listOf("h", "z", "r", "a", "i", "o", "l", "i", "w", "e", "r", "a", "t", "s", "w", "t"))

        val slowa = (0..15).flatMap { realWords(listOf(it), board, words) }
        assertEquals(148, slowa.size)
    }

}


