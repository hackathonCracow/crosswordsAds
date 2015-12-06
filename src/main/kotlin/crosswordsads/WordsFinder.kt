package crosswordsads

import crosswordsads.kasper.MyWords
import crosswordsads.kasper.realWords

fun getWordsOnBoard(board: Board, words: MyWords): List<List<Int>> {
    return (0..15).flatMap { realWords(listOf(it), board, words) }
}