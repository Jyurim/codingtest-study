package boj.io;

import java.io.*;
import java.util.*;

public class _2231 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ret = 0;
        

        // solution �������� ���״� ������ min�� ���ض�

        // 1 basic 144ms
        /** loop var ���� **/
        for(int i = 0; i < N; i++){
            int num = i;
            int sum = 0;
            
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N){
                ret = i;
                break;
            }
        }
        System.out.println(ret);

        // 2 improved 120ms
        // String strN = br.readLine();
		// int N = Integer.parseInt(strN);
        // int len = strN.length();
        // int ret = 0;

        
        // for(int i = (N - (9 * len)); i < N; i++){
        //     int num = i;
        //     int sum = 0;
            
        //     while(num != 0){
        //         sum += num % 10;
        //         num /= 10;
        //     }

        //     if(sum + i == N){
        //         ret = i;
        //         break;
        //     }
        // }
        // System.out.println(ret);
    }
}
