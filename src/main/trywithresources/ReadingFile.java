package trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
        public static void readFile(String path){
            try{
                BufferedReader br=new BufferedReader(new FileReader(path));
                String line=br.readLine();
                if(line!=null){
                    System.out.println(line);
                }else{
                    System.out.println("File Empty!");
                }

            } catch (FileNotFoundException e) {
                System.out.println("Please make a file");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


