package regex.extractionproblems.extractemailaddress;

public class Main {
    public static void main(String[] args) {
        String input = "Contact us at saloni@810.com and akshit@patel.org";
        Extract ex = new Extract();
        ex.extractEmail(input);
    }
}
