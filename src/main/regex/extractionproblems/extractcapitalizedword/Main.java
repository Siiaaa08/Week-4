package regex.extractionproblems.extractcapitalizedword;

public class Main {
    public static void main(String[] args) {
        String text = "He saw it Too let God Handle it";
        ExtractWord word = new ExtractWord();
        word.extractCapital(text);
    }
}
