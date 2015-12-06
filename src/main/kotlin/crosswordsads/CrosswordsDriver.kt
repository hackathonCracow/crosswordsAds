package crosswordsads

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class SeleniumCrosswordsDriver(val webDriver: WebDriver) : CrosswordsDriver {

    override fun typeInId(id: String, text: String) {
        webDriver.findElement(By.id(id)).sendKeys(text)
    }

    override fun clickOnXpath(type: String) {
        webDriver.findElement(By.xpath(type)).click()
    }

    override fun getTextById(id: String): String {
        return webDriver.findElement(By.id(id)).text
    }
}

interface CrosswordsDriver {
    fun typeInId(id: String, text: String)
    fun clickOnXpath(type: String)
    fun getTextById(id: String): String
}
