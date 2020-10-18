package whut.com.hellospring.algorithm;

import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

public class generateStage {

    public List<List<String>> generateStageFn(String [] nodes,String [][] edges){
        List<String> remainNodes = Arrays.asList(nodes);
        List<List<String>> result = new ArrayList<>();
        while (!remainNodes.isEmpty()){
            //set 存储出度不为0的顶点
            Set<String> set = new HashSet<>();
            for (int i = 0; i < edges.length; i++) {
                if(edges[i] == null){
                    break;
                }
                set.add(edges[i][0]);
            }
            //取差集 存储出度为0 的顶点
            List<String> curBatch = new ArrayList<>();
            for (String node:remainNodes) {
                if(!set.contains(node)){
                    curBatch.add(node);
                }
            }

            if(!CollectionUtils.isEmpty(curBatch)){
                result.add(curBatch);
                remainNodes = remainNodes.stream().filter(node->!curBatch.contains(node)).collect(Collectors.toList());
                String [][]  remainEdges = new String [edges.length][];
                int count =0;
                for (int i = 0; i <edges.length; i++) {
                    if(!remainNodes.contains(edges[i][1])){
                        remainEdges[count] = new String [2];
                        remainEdges[count][0] = edges[i][0];
                        remainEdges[count][1] = edges[i][1];
                    }
                }
                edges = remainEdges;
            }else {

            }

        }
        return null;
    }
}
