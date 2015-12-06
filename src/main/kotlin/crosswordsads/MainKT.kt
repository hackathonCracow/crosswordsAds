package crosswordsads

import org.openqa.selenium.firefox.FirefoxDriver

object MainKT {
    fun main(args: Array<String>) {
        val words = Words.fromFile("dictionary/slownik")
        val crosswordsDriver = SeleniumCrosswordsDriver(FirefoxDriver())
        while (true) {
            registerNewAccount(crosswordsDriver)
            goToPlayAndWaitForGameToStart(crosswordsDriver)
            solveGame(crosswordsDriver, words)
            waitForRoundEndAndLogout(crosswordsDriver)
        }
    }
}