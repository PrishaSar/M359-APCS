package Unit7ArrayList;

import java.util.ArrayList;
public class Notes_7_6_InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(1);
        nums.add(6);
        nums.add(4);

        insertionSort(nums);
        System.out.println(nums);

    }

    public static void insertionSort(ArrayList<Integer> list){
        for(int i = 1; i < list.size(); i++){
            int valueToInsert = list.get(i);
            int cur = i;
            while(cur > 0 && list.get(cur-1) > valueToInsert){
                list.set(cur, list.get(cur-1));
                cur --;
            }
            list.set(cur, valueToInsert);
        }
    }
}
