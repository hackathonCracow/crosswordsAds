package crosswordsads

fun solveGame(crosswordsDriver: SeleniumCrosswordsDriver, words: Words) {
    val board = getBoard(crosswordsDriver)
    val wordsOnBoard = getWordsOnBoard(board, words)
    inputWords(crosswordsDriver, wordsOnBoard)
}
