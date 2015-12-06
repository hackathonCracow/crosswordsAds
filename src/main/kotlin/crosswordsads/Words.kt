package crosswordsads

import java.io.File

class Words(val listOfStrings: List<String>) {
    fun find(s: String): Boolean {
        return listOfStrings.any { it.startsWith(s) }
    }

    fun isWord(s: String): Boolean {
        return listOfStrings.contains(s)
    }

    companion object {
        fun fromFile(name: String) = Words(File(name).readLines(Charsets.UTF_8).filter { it.length > 2 })
    }
}
