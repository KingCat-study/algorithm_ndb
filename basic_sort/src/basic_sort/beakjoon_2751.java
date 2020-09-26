package basic_sort;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//제한시간 2초
public class beakjoon_2751 {
         
    public static void main(String[] args) throws IOException {   
        
    	//속도를 높이기 위해 Scanner 대신 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	//속도를 높이기 위해 단순 String 대신 StringBuilder 사용
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        //콜렉션 정렬 사용
        Collections.sort(list);
        
        for(int val : list) {
           sb.append(val).append('\n');
        }
        System.out.println(sb);
    }
}