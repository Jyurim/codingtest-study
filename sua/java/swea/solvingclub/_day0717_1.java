package swea.solvingclub;

import java.io.*;
import java.util.*;

public class _day0717_1 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t < T+1; t++){
            int ans = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());
            
            // dp ���̺� ���� Į�θ�/����
            int[][] dp = new int[N+1][L+1];
            int[] score = new int[N+1];
            int[] cal = new int[L+1];
            for (int n = 1; n < N+1; n++){
                st = new StringTokenizer(br.readLine());
                score[n] = Integer.parseInt(st.nextToken());
                cal[n] = Integer.parseInt(st.nextToken());
            }

            for(int i = 1; i <= N; i++) {  // ����
                for(int j = 1; j <= L; j++) {  // Į�θ�
                    if(cal[i] > j){
                        dp[i][j] = dp[i-1][j]; // ���� ������ ����
                    } else { 
                        dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-cal[i]] + score[i]); // ���� ���տ��� ���� ��ġ�� ���� Į�θ��� ��ġ + �ڽ��� ��ġ �� ū ��
                    }
			    }
            }
            System.out.println("#" + t + " " + dp[N][L]);
        }
    }
}