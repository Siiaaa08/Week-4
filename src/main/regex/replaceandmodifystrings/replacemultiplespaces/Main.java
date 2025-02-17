package regex.replaceandmodifystrings.replacemultiplespaces;

public class Main {
    public static void main(String[] args) {
        String text = "Maybe its the     fragrance  of   your    hair";
        ReplaceSpaces replace = new ReplaceSpaces();
        replace.replaceSpaces(text);
    }
}
