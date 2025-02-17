package multiplecatchblocks;

public class MultipleCatchCode {
        public static void multipleCatchBlock(int[] arr, int index){
            try{
                int k=arr[index];
                System.out.println("Element at "+index+" is "+k);

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Please enter valid index with in range");
            }
            catch (NullPointerException e){
                System.out.println("Please enter element first");
            }
        }
    }


