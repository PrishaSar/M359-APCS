package Unit7ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Notes7_6 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(32);
        nums.add(18);
        nums.add(20);

        selectionSort(nums);
        System.out.println(nums);
    }


    public static void selectionSort(ArrayList<Integer> list){
        for(int i = 0; i < list.size() -1; i++){
            //set min index to current iteration
            int minIndex = i;
            //look for smallest # in list after i;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j) < list.get(minIndex)){
                    minIndex = j;
                }
            }
            //swap index @ i & minIndex
            Integer temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
}
