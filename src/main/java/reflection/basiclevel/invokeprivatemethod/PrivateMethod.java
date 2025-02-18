package reflection.basiclevel.invokeprivatemethod;

public class PrivateMethod {

        String name;
        PrivateMethod(String name){
            this.name=name;
        }
        private void privateMethod(){
            System.out.println(name);
        }

    }


