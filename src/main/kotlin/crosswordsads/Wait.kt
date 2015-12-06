package crosswordsads

fun goToPlayAndWaitForGameToStart(crosswordsDriver: CrosswordsDriver) {
    crosswordsDriver.get("https://slowotok.pl/play")
    while (!crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        Thread.sleep(1000)
    }
}

fun waitForRoundEndAndLogout(crosswordsDriver: CrosswordsDriver) {
    while (crosswordsDriver.getTextById("time_desc").toUpperCase().contains("DO KOŃCA")) {
        Thread.sleep(1000)
    }
    crosswordsDriver.get("https://slowotok.pl/account/logoff")
}
