package crosswordsads

fun waitForRoundStart(crosswordsDriver: CrosswordsDriver) {
    while (!crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        println("Waiting for new round")
        Thread.sleep(1000)
    }
    println("Round began")
}
fun waitForRoundEnd(crosswordsDriver: CrosswordsDriver) {
    while (crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        println("Waiting for round end")
        Thread.sleep(1000)
    }
    println("Round ended")
}
