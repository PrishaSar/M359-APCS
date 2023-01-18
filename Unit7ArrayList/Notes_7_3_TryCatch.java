package Unit7ArrayList;

public class Notes_7_3_TryCatch {
    public static void main(String[] args) {
        int[] myNums = {1,2,3,4};
        String str = "hello";

        try{
//            int x = 5/0;
//            System.out.println("The last num:" + myNums[4]);
            System.out.println(str.substring(8,77));
        }
        //first list ALL the EXPECTED exceptions
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0!!!!!!!");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index. (ARRAY) ");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Invalid index. (STRING) ");
        }
        catch(Exception e){
            //catch all fail-safe
            System.out.println("Something went wrong. ;(");
        }
    }
}
