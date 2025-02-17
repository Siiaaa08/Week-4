package nestedtrycatch;

public class OperationsArray {

        public static int checkArray(int[] arr,int index){
            int ans=0;
            try{
                ans= arr[index];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter valid index");
            }
            return ans;
        }
    }


