package crosswordsads

fun getWordsOnBoardKarol(board: Board, words: Words): List<List<String>> {
    return (0..15).flatMap { goDeper(listOf(it), board, words) }
}

fun goDeper(proposal: List<Int>, board: Board, words: Words): Collection<List<String>> {
    return neighbours[proposal.last()]!!
            .filter { !proposal.contains(it) }
            .map { proposal + it }
            .filter { words.anyStartsWith(board.getStringFromIds(proposal)) }
            .flatMap { goDeper(it, board, words) } + isAWord(proposal, board, words)
}

private fun isAWord(proposal: List<Int>, board: Board, words: Words): List<List<String>> {
    val stringFromIds = board.getStringFromIds(proposal)
    return if (words.isAWord(stringFromIds)) {
        println(stringFromIds)
        listOf(proposal.map { it.toString() })
    } else {
        emptyList()
    }
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
