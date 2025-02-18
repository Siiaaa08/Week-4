package annotation.advancedproblems.jsonfield;

public class Main {
        public static void main(String[] args) {
            JsonFieldCode user = new JsonFieldCode("Saloni", "saloni810@gmail.com", 22);

            String jsonString = JsonFieldCode.json(user);
            System.out.println(jsonString);
        }
    }


