package crosswordsads.kasper

import crosswordsads.Words
import java.io.File

class MyWords(val listOfStrings: List<String>) {
    fun find(s: String): List<String> {
        return listOfStrings.filter { it.startsWith(s) }
    }

    fun isWord(s: String): Boolean {
        return listOfStrings.contains(s)
    }

    companion object {
        fun fromFile(name: String) = MyWords(File(name).readLines(Charsets.UTF_8).filter { it.length > 2 })
    }
}
