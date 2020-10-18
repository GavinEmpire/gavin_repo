package whut.com.hellospring;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //a1-a2,a5-a6,a2-a3
        //a5,a2
        Scanner in = new Scanner(System.in);
        String[] dependArray  = in.nextLine().split(",");
        //Map<String,List<String>> map = new HashMap<>();
        List<LinkedList<String>> linkList =  new ArrayList<>();
        //Map<String,String> map = new HashMap<>();

        for (int i=0;i<dependArray.length;i++){
            String[] split = dependArray[i].split("-");
            /*if(map.containsKey(split[1])){
                map.get()
            }*/
            if(exist(linkList,split)){
                //重新排序
            }else {
                //
                LinkedList<String> dpList = new LinkedList<>();
                dpList.add(split[1]);
                dpList.add(split[0]);
            }
            //map.put(split[0],split[1]);
        }

        String[] brokeDownArray  = in.nextLine().split(",");

    }

    private static boolean exist(List<LinkedList<String>> linkList, String[] split) {

        return false;
    }
}
