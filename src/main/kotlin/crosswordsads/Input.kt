package crosswordsads

fun inputWords(crosswordsDriver: CrosswordsDriver, words: List<List<String>>) {
    words.forEach {
        inputWord(crosswordsDriver, it)
    }
}

fun inputWord(crosswordsDriver: CrosswordsDriver, ids: List<String>) {
    crosswordsDriver.pressOnId(ids.first())
    ids.forEach {
        crosswordsDriver.moveToId(it)
    }
    crosswordsDriver.release()
}
