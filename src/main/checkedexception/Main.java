package checkedexception;

public class Main {
    public static void main(String[] args) {
        Checked checker = new Checked();
        String fileName = "D:/Sample/Day4W4/ExceptionHandling/src/main/java/checkedexception/data.txt";
        checker.readFile(fileName);
    }
}
