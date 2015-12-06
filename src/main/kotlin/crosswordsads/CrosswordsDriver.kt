package crosswordsads

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.interactions.Actions

class SeleniumCrosswordsDriver(val webDriver: WebDriver) : CrosswordsDriver {
    override fun typeInId(id: String, text: String) {
        findElementById(id).sendKeys(text)
    }

    override fun clickOnXpath(type: String) {
        webDriver.findElement(By.xpath(type)).click()
    }

    override fun getTextById(id: String): String {
        return findElementById(id).text
    }

    override fun pressOnId(id: String) {
        Actions(webDriver).clickAndHold(findElementById(id)).build().perform()
    }

    override fun moveToId(id: String) {
        Actions(webDriver).moveToElement(findElementById(id)).build().perform()
    }

    override fun release() {
        Actions(webDriver).release().build().perform()
    }

    private fun findElementById(id: String) = webDriver.findElement(By.id(id))
}

interface CrosswordsDriver {
    fun typeInId(id: String, text: String)
    fun clickOnXpath(type: String)
    fun getTextById(id: String): String
    fun pressOnId(id: String)
    fun moveToId(id: String)
    fun release()
}
