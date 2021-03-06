package crosswordsads

fun getWordsOnBoard(board: Board, words: Words): List<List<Int>> {
    return (0..15).flatMap { fromStartingPoint(listOf(it), board, words) }
}

fun fromStartingPoint(wordData: List<Int>, board: Board, words: Words): List<List<Int>> {
    return possibleContinuations(wordData)
            .filter { isWordOrStartWith(board, it, words) }
            .flatMap { if (isWord(board, it, words)) (fromStartingPoint(it, board, words) + listOf(it)) else fromStartingPoint(it, board, words) }
}

private fun isWordOrStartWith(board: Board, it: List<Int>, words: Words): Boolean {
    return words.find(board.getStringFromIds(it))
}

private fun isWord(board: Board, it: List<Int>, words: Words): Boolean {
    return words.isWord(board.getStringFromIds(it))
}

fun possibleContinuations(wordData: List<Int>): List<List<Int>> {
    val nextLetterIdx = neighbours[wordData.last()]!!.filter { !wordData.contains(it) }
    return nextLetterIdx.map { wordData + it }
}

private val neighbours = mapOf(
        0 to listOf(1, 4, 5),
        1 to listOf(0, 4, 5, 6, 2),
        2 to listOf(1, 5, 6, 7, 3),
        3 to listOf(2, 6, 7),
        4 to listOf(0, 1, 5, 8, 9),
        5 to listOf(0, 1, 2, 4, 6, 8, 9, 10),
        6 to listOf(1, 2, 3, 5, 7, 9, 10, 11),
        7 to listOf(2, 3, 6, 10, 11),
        8 to listOf(4, 5, 9, 12, 13),
        9 to listOf(4, 5, 6, 8, 10, 12, 13, 14),
        10 to listOf(5, 6, 7, 9, 11, 13, 14, 15),
        11 to listOf(6, 7, 10, 14, 15),
        12 to listOf(8, 9, 13),
        13 to listOf(8, 9, 10, 12, 14),
        14 to listOf(9, 10, 11, 13, 15),
        15 to listOf(10, 11, 14))