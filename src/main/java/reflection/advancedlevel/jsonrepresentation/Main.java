package reflection.advancedlevel.jsonrepresentation;

public class Main {
        public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
            JSONPaper ob1=new JSONPaper();
            ob1.data="\"username\": \"Saloni Baruaa\"";
            ob1.message="\"role\":\"admin\"\"";

            Class<?>cls=ob1.getClass();
            JSON json=new JSON();
            json.helper(cls,ob1);
        }
    }


