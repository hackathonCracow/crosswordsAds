package crosswordsads

import org.openqa.selenium.firefox.FirefoxDriver

object MainKT {
    fun main(args: Array<String>) {
        val driver = FirefoxDriver()
        driver.get("https://slowotok.pl/account/register")
        val crosswordsDriver = SeleniumCrosswordsDriver(driver)
        login(crosswordsDriver)
        driver.get("https://slowotok.pl/play")
        waitForRoundStart(crosswordsDriver)
    }
}