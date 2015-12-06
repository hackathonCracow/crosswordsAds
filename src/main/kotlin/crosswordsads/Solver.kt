package crosswordsads

fun solveGame(crosswordsDriver: SeleniumCrosswordsDriver, words: Words) {
    val board = getBoard(crosswordsDriver)
    val wordsOnBoard = getWordsOnBoardKarol(board, words)
    println(wordsOnBoard)
    inputWords(crosswordsDriver, wordsOnBoard)
}
