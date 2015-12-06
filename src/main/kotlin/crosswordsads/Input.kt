package crosswordsads

fun inputWords(crosswordsDriver: CrosswordsDriver, words: List<List<Int>>) {
    words.forEach {
        inputWord(crosswordsDriver, it)
    }
}

fun inputWord(crosswordsDriver: CrosswordsDriver, ids: List<Int>) {
    crosswordsDriver.pressOnId(ids.first())
    ids.forEach {
        crosswordsDriver.moveToId(it)
    }
    crosswordsDriver.release()
}
