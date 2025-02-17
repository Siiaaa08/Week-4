package regex.extractionproblems.extractlinks;

public class Main {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";
        ExtractLinks links = new ExtractLinks();
        links.extractLink(text);
    }
}
