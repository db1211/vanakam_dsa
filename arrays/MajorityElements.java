package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);

        int maxKey = 0;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;

    }

    public static int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums ){

            //select candidate
            if(count ==0){
                candidate =num;
            }
            
            //vote 
            if(candidate == num){
                count +=1;
            }else{
                count-=1;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] list = { 3, 2, 3 };
        int[] list2 = { 2, 2, 1, 1, 1, 2, 2 };
        int[] list3 = { 6,5,5 };


        int result = majorityElement2(list3);
        System.out.println("result" + " " + result);

    }
}
