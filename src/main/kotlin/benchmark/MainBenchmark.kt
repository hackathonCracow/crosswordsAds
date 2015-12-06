package benchmark

import crosswordsads.Board
import crosswordsads.Words
import crosswordsads.getWordsOnBoard
import crosswordsads.getWordsOnBoardKarol
import crosswordsads.kasper.MyWords
import crosswordsads.kasper.realWords

object MainBenchmark {
    fun main(args: Array<String>) {
        val words = MyWords.fromFile("dictionary/slownik")
        val start = System.currentTimeMillis()
        getWordsOnBoard(Board(listOf("h","z","r","a","i","o","l","i","w","e","r","a","t","s","w","t")),words)
        println(System.currentTimeMillis()-start)
    }
}