package swea.practice;

import java.io.*;
import java.util.*;

public class _2021 {
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // 1
        // for(int i = 0; i < 3; i++){
        //     int month = Character.getNumericValue(str.charAt(i));
            
        //     if(3 <= month || month <= 5){
        //         System.out.println(month + "���� ���Դϴ�.");
        //     } else if (6 <= month || month <= 8){
        //         System.out.println(month + "���� �����Դϴ�.");
        //     } else if (9 <= month || month <= 11){
        //         System.out.println(month + "���� �����Դϴ�.");
        //     } else {
        //         System.out.println(month + "���� �ܿ��Դϴ�.");
        //     }
        // }

        // 2
        int i = 0;
        while(i < 3){
            int month = Character.getNumericValue(str.charAt(i));

            switch(month){
                case 3: case 4: case 5:
                    System.out.println(month + "���� ���Դϴ�.");
                    break;
                case 6: case 7: case 8:
                    System.out.println(month + "���� �����Դϴ�.");
                    break;
                case 9: case 10: case 11:
                    System.out.println(month + "���� �����Դϴ�.");
                    break;
                default:
                    System.out.println(month + "���� �ܿ��Դϴ�.");
            }
        }
        
    }
}
