package annotation.intermediateproblems.maxlength;

public class Main {
        public static void main(String[] args) {
            try{
                MaxLengthCode user=new MaxLengthCode();
                user.register("Saloni");
                System.out.println("Name :- "+user.getName());

                MaxLengthCode user2=new MaxLengthCode();
                user.register("SaloniBaruaa");
                System.out.println("Name :- "+user2.getName());


            } catch (IllegalArgumentException e) {
                System.out.println("Error :- "+e.getMessage());
            }
        }
    }


