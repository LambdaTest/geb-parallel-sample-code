package Pages

import geb.Page

class DuckDuckGoQueryPage extends Page {

    static url = "https://www.duckduckgo.com/"

    static at = { title.contentEquals("DuckDuckGo — Privacy, simplified.") }

    static content = {
        searchField { $("input", id: "search_form_input_homepage")}
        searchButton { $("input", id:"search_button_homepage") }
        displayCheck { $("input", id:"search_button_homepage") }
    }

    void search(String word) {

        searchField.value(word)
        println(displayCheck.displayed)
        println(displayCheck.isDisplayed())
        searchButton.click()

    }
}