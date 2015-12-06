package crosswordsads

import org.openqa.selenium.firefox.FirefoxDriver

object MainKT {
    fun main(args: Array<String>) {
        val words = Words.fromFile("dictionary/slownik")
        val driver = FirefoxDriver()
        driver.get("https://slowotok.pl/account/register")
        val crosswordsDriver = SeleniumCrosswordsDriver(driver)
        login(crosswordsDriver)
        driver.get("https://slowotok.pl/play")
        waitForRoundStart(crosswordsDriver)
        val board = getBoard(crosswordsDriver)
        val wordsOnBoard = getWordsOnBoard(board, words)
        inputWords(crosswordsDriver, wordsOnBoard)
        waitForRoundEnd(crosswordsDriver)
    }
}