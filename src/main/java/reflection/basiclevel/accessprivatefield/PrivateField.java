package reflection.basiclevel.accessprivatefield;

public class PrivateField {
        private static int age;
        static int  help=age;
        public static void helper(){

            System.out.println("Age is: "+help);

        }
    }


