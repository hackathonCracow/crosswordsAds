package crosswordsads

import java.io.File

class Words(val words: List<String>) {

    fun find(stringFromIds: String): Pair<Boolean, Boolean> {
        var exists = false
        var startsWith = false
        words.forEach {
            if (it == stringFromIds) {
                exists = true
            } else if (it.startsWith(stringFromIds)) {
                startsWith = true
            }
        }
        return Pair(exists, startsWith)
    }

    companion object {
        fun fromFile(name: String): Words {
            return Words(File(name).readLines(Charsets.UTF_8))
        }
    }
}