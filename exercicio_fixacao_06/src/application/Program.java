package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int[n][m];
		
		for (int i=0; i<n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				if(mat[i][j] == x) {
					System.out.println();
					System.out.print("Position " + i + "," + j + ":");
					System.out.println();
					int left = j - 1;
					if (left >= 0) {
						System.out.print("Left: " + mat[i][left]);
						System.out.println();
					}
					
					int right = j + 1;
					if (right < m) {
						System.out.print("Right: " + mat[i][right]);
						System.out.println();
					}
					
					int up = i - 1;
					if (up >= 0) {
						System.out.print("Up: " + mat[up][j]);
						System.out.println();
					}
					
					int down = i + 1;
					if (down < m) {
						System.out.print("Down: " + mat[down][j]);
						System.out.println();
					}
					
					
				}
				
			}
		}
		
		sc.close();
	}
}
