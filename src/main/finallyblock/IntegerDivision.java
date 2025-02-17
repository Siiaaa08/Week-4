package finallyblock;

public class IntegerDivision {
        public static int division(int a,int b){
            int ans=0;
            try{
                ans=a/b;
                System.out.println(ans);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("Operation fully executed!");
            }
            return ans;
        }
    }

