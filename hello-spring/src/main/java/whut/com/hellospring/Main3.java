package whut.com.hellospring;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.replaceAll("\\(","").replaceAll("\\)","");
        String[] nums = input.split(",");
        TreeMap<Integer,List<Integer>> map  = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(i%2==0){
                continue;
            }
            if(map.containsKey(Integer.parseInt(nums[i]))){
                List<Integer> list = map.get(Integer.parseInt(nums[i]));
                if(list.indexOf(Integer.parseInt(nums[i-1])) == -1){
                    list.add(Integer.parseInt(nums[i-1]));
                }
            }else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(Integer.parseInt(nums[i-1]));
                map.put(Integer.parseInt(nums[i]),list);
            }
        }
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer,List<Integer>> entry:map.entrySet()) {
            List<Integer> values = entry.getValue();
            for (int i = values.size()-1; i >= 0; i--) {
                result.add(values.get(i));
            }
        }
        for (int i = result.size() - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(result.get(i) + ",");
            } else {
                System.out.print(result.get(i));
            }
        }
    }

}
