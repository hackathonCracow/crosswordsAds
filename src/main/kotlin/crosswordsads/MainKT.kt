package crosswordsads

import org.openqa.selenium.firefox.FirefoxDriver

object MainKT {
    fun main(args: Array<String>) {
        val words = Words.fromFile("dictionary/slownik")
        val driver = FirefoxDriver()
        val crosswordsDriver = SeleniumCrosswordsDriver(driver)
        while (true) {
            login(crosswordsDriver)
            driver.get("https://slowotok.pl/play")
            waitForRoundStart(crosswordsDriver)
            val board = getBoard(crosswordsDriver)
            val wordsOnBoard = getWordsOnBoardKarol(board, words)
            println(wordsOnBoard)
            inputWords(crosswordsDriver, wordsOnBoard)
            waitForRoundEnd(crosswordsDriver)
            driver.get("https://slowotok.pl/account/logoff")
        }
    }
}