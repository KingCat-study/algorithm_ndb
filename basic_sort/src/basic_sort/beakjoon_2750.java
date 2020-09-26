package basic_sort;

import java.util.Scanner;

public class beakjoon_2750 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int array = 1001; 
        int n = kb.nextInt();
        int [] data = new int[array];
                
        for(int i = 0; i < n; i++) {
            data[i] = kb.nextInt();
        }
        
        kb.close();
        
        int min = 0, index = 0;
        
        for(int i = 0; i < n; i++) {
            min = array;
            for(int j = i; j < n; j++) {
                if(min > data[j]){
                    min = data[j];
                    index = j;
                }
            }
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.printf("%d ", data[i]);
        }
    }
}