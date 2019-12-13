package Spec
/**
 * Created by Arpit Gupta on 12-12-2019.
 */

import Pages.DuckDuckGoQueryPage
import Pages.DuckDuckGoResultPage
import geb.driver.CachingDriverFactory

class BingSpecPageGebSpec extends BasePageGebSpec {

    def cleanup() {
        CachingDriverFactory.clearCache()
    }

    def "Geb Code: LambdaTest Grid"() {
        String q = "FactWish facts"
        DuckDuckGoResultPage.searchWord = q

        when:
        to DuckDuckGoQueryPage

        and:
        search(q)

        then:
        waitFor {at DuckDuckGoResultPage}


    }
}
