package regex.replaceandmodifystrings.censorbadwords;

public class Main {
    public static void main(String[] args) {
        String text = "This is a damm bad example with some stupid words";
        String[] badWords = {"damm","stupid"};
        CensorBadWords censor = new CensorBadWords(badWords);
        String censoredText = censor.censorText(text);
        System.out.println(censoredText);

    }
}
