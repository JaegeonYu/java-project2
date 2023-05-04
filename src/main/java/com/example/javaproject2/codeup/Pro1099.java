package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Pro1099 {
    private static int dx[]={1,0};
    private static int dy[]={0,1};
    private static int arr[][] = new int[10][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)arr[i][j]=sc.nextInt();
        }
        if(arr[1][1]==0){
            dfs(1,1);
        }else arr[1][1]=9;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    private static void dfs(int y, int x) {
        arr[y][x]=9;
        boolean flag = true;
        for(int i=0;i<2;i++){
            if(flag){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx <0 || ny <0 || nx >= arr.length|| ny >= arr.length)continue;
                if(arr[ny][nx]==1)continue;
                if(arr[ny][nx]==2){
                    arr[ny][nx]= 9;
                    return;
                }
                arr[ny][nx]= 9;
                flag = false;
                dfs(ny, nx);
            }

        }
    }
}
