package crosswordsads

import java.io.File

class Words {

    val listOfStrings: Set<String>
    val letterToWords: Map<Char, List<String>>

    constructor(listOfStrings: List<String>) {
        this.listOfStrings = listOfStrings.toSet()
        letterToWords = listOfStrings.groupBy { it.first() }
    }

    fun find(s: String): Boolean {
        return letterToWords[s.first()]!!.any { it.startsWith(s) }
    }

    fun isWord(s: String): Boolean {
        return listOfStrings.contains(s)
    }

    companion object {
        fun fromFile(name: String) = Words(File(name).readLines(Charsets.UTF_8).filter { it.length > 2 })
    }
}
