package annotation.intermediateproblems.maxlength;

import java.lang.reflect.Field;

public class MaxLengthCode {
        @MaxLength(10)
        private String name;


        public void register(String name){
            validate(name);
            this.name=name;
        }
        private void validate(String name){
            try{
                Field field=this.getClass().getDeclaredField("name");
                if(field.isAnnotationPresent(MaxLength.class)){
                    MaxLength maxLength=field.getAnnotation(MaxLength.class);
                    if(name.length()> maxLength.value()){
                        throw new IllegalArgumentException("Name is too big");
                    }
                }
            } catch (NoSuchFieldException e) {
                System.out.println(e.getMessage());
            }
        }
        String getName(){
            return name;
        }
    }




