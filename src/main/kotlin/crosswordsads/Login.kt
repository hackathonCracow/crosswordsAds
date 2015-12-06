package crosswordsads

fun login(crosswordsDriver: CrosswordsDriver) {
    crosswordsDriver.typeInId("Firstname", "Maski");
    crosswordsDriver.typeInId("Lastname", "Przeciwpyłowe")
    crosswordsDriver.typeInId("Email", randomEmail())
    crosswordsDriver.typeInId("Password", "123456")
    crosswordsDriver.typeInId("ConfirmPassword", "123456")
    crosswordsDriver.clickOnXpath("//input[@type=\"submit\"]")
}

fun randomEmail(): String {
    return "uniqueemail@shitmail.me"
}
