package crosswordsads

import org.openqa.selenium.firefox.FirefoxDriver
import java.awt.Robot
import java.awt.event.KeyEvent

object MainKT {
    fun main(args: Array<String>) {
        val words = Words.fromFile("dictionary/slownik")
        val crosswordsDriver = SeleniumCrosswordsDriver(FirefoxDriver())
        while (true) {
            registerNewAccount(crosswordsDriver)
            setUpAnAvatar(crosswordsDriver)
            goToPlayAndWaitForGameToStart(crosswordsDriver)
            solveGame(crosswordsDriver, words)
            waitForRoundEndAndLogout(crosswordsDriver)
        }
    }

    private fun setUpAnAvatar(crosswordsDriver: CrosswordsDriver) {
        crosswordsDriver.get("https://slowotok.pl/account/settings")
        crosswordsDriver.clickOnId("changeAvatar")
        val robot = Robot()
        robot.keyPress(KeyEvent.VK_ENTER)
        Thread.sleep(10)
        robot.keyRelease(KeyEvent.VK_ENTER)
        Thread.sleep(300)
    }
}