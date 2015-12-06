package crosswordsads

import java.io.File

class Words(val words: List<String>) {

    fun anyStartsWith(stringFromIds: String): Boolean {
        return words.any { it.startsWith(stringFromIds) }
    }

    fun isAWord(stringFromIds: String): Boolean {
        return words.contains(stringFromIds)
    }

    fun find(stringFromIds: String): Pair<Boolean, Boolean> {
        return words.fold(Pair(false, false), { accumulator, word ->
            Pair(accumulator.first || word == stringFromIds, accumulator.second || word.startsWith(stringFromIds))
        })
    }

    companion object {
        fun fromFile(name: String): Words {
            return Words(File(name).readLines(Charsets.UTF_8).filter { it.length > 2 })
        }
    }
}