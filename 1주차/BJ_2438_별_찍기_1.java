package 백준;
// 별 찍기 - 1
// https://www.acmicpc.net/problem/2438

import java.util.Scanner;

public class BJ_2438_별_찍기_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
