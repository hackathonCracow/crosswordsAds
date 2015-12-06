package crosswordsads

import crosswordsads.kasper.MyWords
import crosswordsads.kasper.realWords
import org.junit.Test
import java.io.File
import kotlin.test.assertEquals

class MyTestCase() {

    @Test
    fun shouldNotFindWord() {
        val results = MyWords(listOf("a")).find("b")

        assertEquals(listOf(), results)
    }

    @Test
    fun shouldFindWord() {
        val results = MyWords(listOf("a")).find("a")

        assertEquals(listOf("a"), results)
    }

    @Test
    fun shouldFindWordAndWordWhichStartsWith() {
        val resutls = MyWords(listOf("a", "ab")).find("a")

        assertEquals(listOf("a", "ab"), resutls)
    }

    @Test
    fun shouldCreateChains() {
        val words = MyWords.fromFile("dictionary/slownik")
        val board = Board(listOf("h","z","r","a","i","o","l","i","w","e","r","a","t","s","w","t"))

        val slowa = (0..15).flatMap { realWords(listOf(it), board, words) }
        assertEquals(148, slowa.size)
    }

}


