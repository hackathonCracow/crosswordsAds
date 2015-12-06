package crosswordsads

fun getWordsOnBoardKarol(board: Board, words: Words): List<List<String>> {
    return (0..15).flatMap { goDeper(listOf(it), board, words) }
}

fun goDeper(proposal: List<Int>, board: Board, words: Words): Collection<List<String>> {
    if (hasDuplicates(proposal)) {
        return emptyList()
    } else {
        val stringFromIds = board.getStringFromIds(proposal)
        println(stringFromIds)
        val (exists, startsWith) = words.find(stringFromIds)
        val current = if (exists) {
            println("matchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatchmatch")
            listOf(proposal.map { it.toString() })
        } else {
            emptyList()
        }
        val more = if (startsWith) {
            (0..15).filter { areClose(it, proposal.last()) }.flatMap { goDeper(proposal + it, board, words) }
        } else {
            emptyList()
        }
        return current + more
    }
}

fun hasDuplicates(proposal: List<Int>) = proposal.distinct().size != proposal.size

fun areClose(it: Int, last: Int): Boolean {
    return listOf(1, 4, 5, -1, -4, -5, -3, 3).contains(it - last)
}
