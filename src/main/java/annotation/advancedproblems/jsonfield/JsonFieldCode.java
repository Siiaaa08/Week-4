package annotation.advancedproblems.jsonfield;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonFieldCode {
        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_email")
        private String email;

        private int age;

        public JsonFieldCode(String username,String email,int age){
            this.age=age;
            this.email=email;
            this.username=username;
        }

        public static String json(Object obj){
            try{
                Class<?> objClass=obj.getClass();
                Map<String,String> jsonMap=new HashMap<>();

                for(Field field:objClass.getDeclaredFields()){
                    field.setAccessible(true);

                    if(field.isAnnotationPresent(JsonField.class)){
                        JsonField annotation=field.getAnnotation(JsonField.class);
                        jsonMap.put(annotation.name(),field.get(obj).toString());
                    }
                }
                return jsonMap.toString().replace("=", ": ");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }


