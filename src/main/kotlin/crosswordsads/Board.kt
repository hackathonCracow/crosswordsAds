package crosswordsads

class Board(val letters: List<String>) {

    fun getStringFromIds(indexes: List<Int>): String {
        return indexes.map { letters[it] }.joinToString("")
    }
}