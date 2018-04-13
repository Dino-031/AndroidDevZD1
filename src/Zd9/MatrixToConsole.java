package Zd9;

public class MatrixToConsole {
    public static void main(String[] args)
    {
        int[][] matrix = new int[5][6];
        for(int i=0;i<5;i++)
        {
            for(int j = 0;j<6;j++)
                matrix[i][j]=0 + (int)(Math.random() * ((10 - 0) + 1));
        }
        for(int i=0;i<5;i++)
        {
            for(int j = 0;j<6;j++)
                System.out.printf("%d\t",matrix[i][j]);
            System.out.printf("\n");
        }
    }
}
