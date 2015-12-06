package crosswordsads

class Words(val words: List<String>) {

    companion object {
        fun fromFile(name: String): Words {
            return Words(listOf("mama"))
        }
    }
}