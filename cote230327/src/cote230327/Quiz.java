package cote230327;

import java.awt.*;
import java.io.FileInputStream;
import java.util.*;

public class Quiz {
	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int x1 = 0, y1 = 0, x2 = 1, y2 = 1;
		int sum = 0;
		for (int i = x1; i <= x2; i++) {
			for (int j = y1; j <= y2; j++) {
				sum += arr[i][j];
				}
			} System.out.println("합계: " + sum);
			}
	}