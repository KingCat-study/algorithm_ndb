package basic_sort;

import java.util.Scanner;

//선택 정렬 사용
public class beakjoon_2752 {
    public static void main(String[] args) {
        int [] data = new int[3];      
   
        Scanner kb = new Scanner(System.in);
        
        for(int i = 0; i < data.length; i++) {
            data[i] = kb.nextInt();
        }
        
        kb.close();
        
       int min = 0, index = 0;
       
        for(int i = 0; i < data.length; i++) {
            min = 1000001;
            for(int j = i; j < data.length; j++){
                if(min > data[j]) {
                    min = data[j];
                    index = j;
                }
            }
            
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        
	   for (int i = 0; i < data.length; i++) {
			System.out.printf("%d ",data[i]);
	   }
    }
}