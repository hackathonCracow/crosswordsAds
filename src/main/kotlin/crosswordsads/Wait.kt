package crosswordsads

fun waitForRoundStart(crosswordsDriver: CrosswordsDriver) {
    while (!crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        println("Waiting for new round")
        Thread.sleep(1000)
    }
    println("Round begin")
}
fun waitForRoundEnd(crosswordsDriver: CrosswordsDriver) {
    while (crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        println("Waiting for new round")
        Thread.sleep(1000)
    }
    println("Round begin")
}
