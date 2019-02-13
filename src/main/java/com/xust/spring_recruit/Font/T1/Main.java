package com.xust.spring_recruit.Font.T1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        char[][] pinat = new char[N+1][M+1];
        for(int i=0; i<N; i++){
            String str = input.next();
            for(int j=0; j<M; j++){
                pinat[i][j] = str.charAt(j);
            }
        }

        int[][] flag = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++)
                flag[i][j] = 0;
        }

        int cnt =0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(flag[i][j]==0 && pinat[i][j] == 'Y'){
                    cnt++;
                    flag[i][j] = 1;
                    for(int a=1,b=1; a<N && b<M; a++,b++){
                        if(flag[a][b]==0 && pinat[a][b] == 'G'){
                            cnt++;
                            break;
                        }
                    }
                    for(int a=1,b=1; a<N && b<M; a++,b++){
                        flag[a][b] = 1;
                    }
                }
                if(flag[i][j]==0 && pinat[i][j] == 'B'){
                    cnt++;
                    flag[i][j] = 1;
                    for(int a=1,b=1; a<N && b<M; a++,b++){
                        if(flag[a][b]==0 && pinat[a][b] == 'G'){
                            cnt++;
                            break;
                        }
                    }
                    for(int a=1,b=1; a<N && b<M; a++,b++){
                        flag[a][b] = 1;
                    }
                }
            }
        }
        System.out.println(cnt-2);
    }
}
