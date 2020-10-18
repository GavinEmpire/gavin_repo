package whut.com.hellospring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main4 {
    public static void main(String[] args) {
        //3 5 7 -1 -1 2 4
        //3 7 2
        Scanner in = new Scanner(System.in);
        String[] array  = in.nextLine().split("");
        //Integer [] treeArray = new Integer[512];
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i]));
        }
        for(int i=1;i<list.size();i++){
            List<Integer> path = new ArrayList<>();
            if(list.get(i) != -1){
                path.add(i);
            }
            getChild(list,i,path);
        }
        //初始值为根节点
        Integer min = list.get(1);
        //findAllLeaveIndex(list);
    }

    public static void getChild(List<Integer> list,int index,List<Integer> path){
        if(index*2+1 <= list.size()-1){
            if(list.get(2*index) == -1 || list.get(2*index) == -1){
                path.add(index);
                //getChild(list,index*2);
                //getChild(list,index*2+1);
            }
        }else {
            //return 0;
        }
    }
    private static void findAllLeaveIndex(List<Integer> list) {
        TreeMap<Integer,List<Integer>> map  = new TreeMap();
        for(int i=1;i< list.size()-1;i++){
            List<Integer> path = new ArrayList<>();
            if(list.get(i) != -1){
                path.add(i);
            }
        }
    }
}
