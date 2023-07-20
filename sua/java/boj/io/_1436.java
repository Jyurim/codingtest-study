package boj.io;

import java.io.*;
import java.util.*;

public class _1436 {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 666;
        int cnt = 0;

        // System.out.println(N % 1000);
        
        // 1 ������ �̿� 240ms
        // while(true){
            
        //     int temp = n;
        //     while(temp >= 666){
        //         if(temp % 1000 == 666){
        //             cnt++;
        //             if(cnt == N){ System.out.println(n); return; }
        //             break;  // ��� ����(n) �ϳ��� cnt�� �ø��� �ִ� ��ȸ�� �ѹ��̹Ƿ� if �� ���Ŀ��� �ݵ�� break ���ԵǾ��
        //         } 
        //         temp /= 10; 
        //     }
        //     n++;
        // }
        
        // 2 String.valueOf 384ms
        while (true) {
            if (String.valueOf(n).contains("666")) {
                cnt++;
                if (cnt == N) {
                    System.out.println(n);
                    break;
                }
            }
            n++;
        }
    }
    
}
