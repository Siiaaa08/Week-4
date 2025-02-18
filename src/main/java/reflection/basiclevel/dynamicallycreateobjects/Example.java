package reflection.basiclevel.dynamicallycreateobjects;

public class Example {
        String name;
        String message;

        Example(String name,String message){
            this.message=message;
            this.name=name;

        }

        @Override
        public String toString(){
            return ("Name: "+name+"\nMessage: "+message);
        }

    }


