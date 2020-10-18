package whut.com.hellospring;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] charArray  = in.nextLine().toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        //map.put()
        List<Object> list = new ArrayList<>();
        //List<Node> list = new ArrayList<>();
        Character lastChar = null;
        int count=1;
        for (int i = 0; i < charArray.length; i++) {
            if(i==0){
                lastChar = charArray[i];
                //Node node = new Node();
                list.add(charArray[i]);
                list.add(1);
            }else {
                if(charArray[i] == lastChar){
                    count++;
                }else {
                    if(count != 1){
                        list.set(list.size()-1,count);
                        count =1;
                    }
                    list.add(charArray[i]);
                    list.add(1);
                }
                if(i == charArray.length-1){
                    if(count != 1){
                        list.set(list.size()-1,count);
                        count =1;
                    }
                }
            }
            lastChar = charArray[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <list.size(); i++) {
            if(i != list.size()-1){
                sb.append(list.get(i)+"_");
            }else {
                sb.append(list.get(i));
            }
        }
        System.out.println(sb.toString());
    }
}