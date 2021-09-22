package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int row, col, i, j;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of rows: ");
    row = in.nextInt();
    System.out.println("Enter number of columns: ");
    col = in.nextInt();

    int mat1[][] = new int[row][col];
    int mat2[][] = new int[row][col];
    int result[][] = new int [row][col];

    System.out.println("Enter the elements for the first matrix: ");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j< col; j++)
            mat1[i][j] = in.nextInt();
        System.out.println();
    }
    System.out.println("Enter the elements for the second matrix: ");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j< col; j++)
            mat2[i][j] = in.nextInt();
        System.out.println();
        }
    for (i = 0; i < row; i++)
        for(j = 0; j<col; j++)
            result[i][j] = mat1[i][j]+mat2[i][j];
        System.out.println("Resulting matrix: ");

        for (i=0; i < row; i++){
            for(j=0; j<col; j++)
                System.out.print(result[i][j]+"\t");
            System.out.println();
        }

    }

}

