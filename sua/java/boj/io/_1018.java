package boj.io;

import java.io.*;
import java.util.*;

public class _1018 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] strNM = br.readLine().split(" ");
        int N = Integer.parseInt(strNM[0]);
        int M = Integer.parseInt(strNM[1]);

        String[][] board = new String[N][M];

        for(int n = 0; n < N; n++){
            String str = br.readLine();
            for(int m = 0; m < M; m++){
                if (str.charAt(m) == 'W'){
                    board[n][m] = "W";
                } else {
                    board[n][m] = "B";
                }
            }
        }

        int min = 64;
        // solution
        // �ڸ��� �����ϴ� �ε����� �Űܰ��� ĥ�ؾ��ϴ� �� ���� -> �ּڰ� ���
        // ���� �ε����� board ũ�⿡ ���� ����
        for(int i = 0; i < N - 7 ; i++){
            for(int j = 0; j < M - 7; j++){
                min = Math.min(min, paint(i, j, board));
            }
        }
        System.out.println(min);

    }
    // board[x][y]�� �����ؼ� ĥ�ؾ��ϴ� �� return
        public static int paint(int x, int y, String[][] arr){
            
            int cnt = 0;
            // board[x][y]�� B W �� ���� �޶���

            String color = "W"; // ù��° ĭ�� W�ΰ� �������� ����
		
            for(int i = x ; i < x + 8 ; i++) { 
                for(int j = y ; j < y + 8 ; j++) {
                    
                    // color�� �������� ü�����̰� WB[i][j]�� ��
                    if(!arr[i][j].equals(color)) {
                        cnt++;
                    }
                    
                    if(color.equals("W")) { // �÷� ���� -> ���� color�� �ݴ�� switch
                        color = "B";
                    }else {
                        color = "W";
                    }
                }
                
                if(color.equals("W")) { // ���� �ٲ�� �ٷ� ��ĭ�� ������ �޶�� ��
                    color = "B";
                }else {
                    color = "W";
                }
            }

            cnt = Math.min(cnt, 64 - cnt);

            return cnt;
    }
}
