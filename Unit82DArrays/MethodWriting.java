package Unit82DArrays;

public class MethodWriting {

    public static void main(String[] args) {

        int[][] myNums = { {9,7,25,3}, {29,8,22,10}, {19,16,9,1} };

        showArray(myNums);

        System.out.println();

        System.out.println("Average: " + getAvg(myNums));

        int evenRowCount = getEvenRowCount(myNums);

        System.out.println(evenRowCount);

        System.out.println(evenColumnCount(myNums));

    }

    //1. Don't forget the spaces and line breaks!
    public static void showArray(int[][] arr){
        for(int[] row: arr){
            for(int num: row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //2. Output the average of all numbers in myNums
    public static double getAvg(int[][] arr){
        int sum = 0;

        for(int[] row: arr){
            for(int num: row){
                sum += num;
            }
        }

        //multiply the number of rows by the number of integers in each row
        int count = arr.length * arr[0].length;
        return (double)sum/count;
    }

    //3. Find the number of rows that contain at least one even number.
    public static int getEvenRowCount (int[][] arr){
        int rows = 0;
        for(int[] row: arr){

            for(int num: row){
                if(num%2 == 0){
                    rows += 1;
                    break;
                }
            }

        }
        return rows;
    }

    //4. Find the number of columns that have at least one even number
    public static int evenColumnCount(int[][] arr){
        int columns = 0;
        for(int r = 0; r < arr[0].length; r++){
            for(int i = 0; i < arr.length; i++){
                if (arr[i][r]%2 == 0){
                    columns ++;
                    break;
                }
            }

        }
        return columns;
    }
}
