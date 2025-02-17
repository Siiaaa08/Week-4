package checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
    public void readFile(String fileName){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println("File Not Found");
        }
    }
}
