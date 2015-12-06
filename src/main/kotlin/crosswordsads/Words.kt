package crosswordsads

import java.io.File

class Words(val words: List<String>) {

    companion object {
        fun fromFile(name: String): Words {
            return Words(File(name).readLines(Charsets.UTF_8))
        }
    }
}