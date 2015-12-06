package crosswordsads

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class SeleniumCrosswordsDriver(val webDriver: WebDriver) : CrosswordsDriver {
    override fun typeInId(id: String, text: String) {
        webDriver.findElement(By.id(id)).sendKeys(text)
    }

}

interface CrosswordsDriver {
    fun typeInId(id: String, text: String)
}
