
class CupCakeOrderScreentest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActicity>()

    @Test
    fun selecetOptionScreen_verifyContent(){
        val flavors = listOf("Vanilla", "Chocolate", "Hazelnut", "Cookie", "Mango")
        val subtotal = "$100"

        composeTestRule.setContent {
            selectOptionScreen(subtotal = subtotal, options = flavors)
        }

        flavors.forEach { flavor ->
            composeTestRule.onNodeWithText(flavor).assertIsDisplayed()
        }

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(
                R.string.subtotal_price,
                subtotal
            )
        ).assertDisplayed()

        composeTestRule.onNodeWithStringId(R.string.next).assertIsNotEnabled()
    }
}