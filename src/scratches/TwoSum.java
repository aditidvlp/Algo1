package scratches;

import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;

public class TwoSum{


    public static void main(String[] args){
        List<String > li = new java.util.LinkedList<>();
        li.add("the");
        li.add("bats");
        li.add("tabs");
        li.add("in");
        li.add("cat");
        li.add("act");

        List<String> sen = new java.util.LinkedList<>();
        sen.add("cats the bats");
        sen.add("act the bats");
        sen.add("cat the tabs");
        sen.add("acts the tabs");

        System.out.println(count(li, sen));

        //  System.out.println(nums[0]);
    }

    public  static List<Long> count(List<String> words, List<String> sentences){
        for(int i = 0;i < words.size();i++){
            char[] s = words.get(i).toCharArray();
            Arrays.sort(s);
            words.set(i, s.toString());
        }

        Map<String, Integer> mp = new HashMap<>();
        for(String s : words){
            char [] tmp = s.toCharArray();
            Arrays.sort(tmp);
            mp.put(tmp.toString(), mp.getOrDefault(tmp.toString(), 0) +1 );
        }

        List<Long> li = new LinkedList<>();
        for(String s : senteces){
            long num = 0;
            String [] arrs = s.split(" ");
            for(String w : arrs){
                char [] tmp = w.toCharArray();
                Arrays.sort(tmp);
                num += mp.get(tmp.toString());
            }
            li.add(num);
        }
        return li;
    }
}
