package scratches;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count =0;
        int val;
        int x = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                val =  1;
                map.put(nums[i], val);
            }
            else {
                val= map.get(nums[i]);
                val = val +1;
                map.put(nums[i], val);

            }

        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {

            count = entry.getValue();
            x = count * (count -1)/2;
            System.out.println(x);
        }

        return x;
    }

}