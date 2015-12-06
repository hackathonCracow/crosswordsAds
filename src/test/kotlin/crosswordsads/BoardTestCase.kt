package crosswordsads

import org.junit.Test
import kotlin.test.assertEquals

class BoardTestCase {

    @Test
    fun shouldReturnStringFromIds() {
        assertEquals("aba", Board(listOf("a", "b")).getStringFromIds(listOf(0, 1, 0)))
    }
}