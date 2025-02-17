package regex.extractionproblems.extractdates;

public class Main {
    public static void main(String[] args) {
        String text = "The events are scheduled for 14/02/2025, 18/02/2025, and 28/02/2025";
        ExtractDates dates = new ExtractDates();
        dates.extractDate(text);

    }
}
