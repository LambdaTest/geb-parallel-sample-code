package Pages

class DuckDuckGoResultPage extends DuckDuckGoQueryPage {

    public static String searchWord;

    static at = { title.startsWith(searchWord) }
}