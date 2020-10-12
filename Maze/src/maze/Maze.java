package maze;

import java.util.*;

public class Maze {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int acak0 = random.nextInt(19)+1;
		int acak1 = random.nextInt(2);
		int acak2 = random.nextInt(2);
		int[][] Array = new int[20][20];
		int j = 0, i = 0;

		for (i = 0; i<Array.length; i++) {
			if (i == 0 || i == Array.length-1) {
				for (j = 0; j<Array[i].length; j++) {
					if (j == 0 || j == Array[i].length-1) {
						Array[i][j] = 9;
						if (Array[i][j]==9) {
							System.out.print("|");
						}
					} else {
						Array[i][j] = 8;
						if (Array[i][j]==8) {
							System.out.print("-");
						}
					}
				}
			} else {
				for (j = 0; j < Array[i].length; j++) {
					if (j == 0 || j == Array[i].length-1) {
						Array[i][j] = 9;
						if (Array[i][j]==9) {
							System.out.print("|");
						}
					}
				}
				System.out.println();
			}

			Array[acak0][acak0] = 5;
			if (Array[acak0][acak0] == 5) {
				System.out.print(0);
			}

		}

	}
}