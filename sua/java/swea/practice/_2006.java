package swea.practice;

import java.io.*;
import java.util.*;

public class _2006 {
    static int times;
    static int win;
    static int cnt = 0;
    static int comWin = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // public class DigitTest1 {

    // }

    // public class DigitTest2 {

    // }
    public static void main(String[] args) throws IOException {
        System.out.println("���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
        System.out.println();
        System.out.println("1. 5�� 3��");
        System.out.println("1. 3�� 2��");
        System.out.println("1. 1�� 1��");
        System.out.println();
        System.out.print("��ȣ�� �Է��ϼ���.");
        int T = Integer.parseInt(br.readLine());
        

        System.out.println();
        switch (T) {
            case 1:
                times = 5;
                win = 3;
                break;
        
            case 2:
                times = 3;
                win = 2;
                break;

            case 3:
                times = 1;
                win = 1;
                break;
        }

        for(int t = 0; t < times; t++) {
            
            System.out.print("���������� �� �ϳ� �Է�: ");
            int num = Integer.parseInt(br.readLine());
            switch (num) {
                case 1:
                    System.out.println("����");
                    break;
            
                case 2:
                    System.out.println("����");
                    break;

                case 3:
                    System.out.println("��");
                    break;
            }

            int comNum = (int) (Math.random()*3 + 1);
            

            if(comNum == num) {
                System.out.println("�����ϴ�!!!");
            } else if(comNum == 1) {
                if(num == 2) {
                    System.out.println("�̰���ϴ�!!!");
                    cnt++;
                } else {
                    System.out.println("�����ϴ�!!!");
                    comWin++;
                }
            } else if (comNum == 2) {
                if(num == 1) {
                    System.out.println("�����ϴ�!!!");
                    comWin++;
                } else {
                    System.out.println("�̰���ϴ�!!!");
                    cnt++;
                }
            } else {
                if(num == 1) {
                    System.out.println("�̰���ϴ�!!!");
                    cnt++;
                } else {
                    System.out.println("�����ϴ�!!!");
                    comWin++;
                }
            }
            
            if(cnt > comWin) {
                System.out.println("###���� ��!!!");
            } else { System.out.println("###��ǻ�� ��!!!");}
    }
}
}


// �� ��
// 1  2 ����
// 1  3 ����
// 2  1 ����
// 2  3 ����
// 3  1 ����
// 3  2 ����
// n  n ���