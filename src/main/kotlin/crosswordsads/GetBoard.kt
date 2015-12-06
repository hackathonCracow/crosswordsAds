package crosswordsads

fun getBoard(crosswordsDriver: CrosswordsDriver): Board {
    return Board((0..15).map { crosswordsDriver.getTextById(it.toString()).toLowerCase() })
}