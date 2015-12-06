package crosswordsads

import java.util.*

fun login(crosswordsDriver: CrosswordsDriver) {
    crosswordsDriver.get("https://slowotok.pl/account/register")
    crosswordsDriver.typeInId("Firstname", "Maski");
    crosswordsDriver.typeInId("Lastname", "http://antysmogowe.pl/")
    crosswordsDriver.typeInId("Email", randomEmail())
    crosswordsDriver.typeInId("Password", "123456")
    crosswordsDriver.typeInId("ConfirmPassword", "123456")
    crosswordsDriver.clickOnXpath("//input[@type=\"submit\"]")
}

fun randomEmail(): String {
    val random = Random()
    val email = (1..10).map { random.nextInt().toChar() }.joinToString("")
    return email + "@shitmail.me"
}
