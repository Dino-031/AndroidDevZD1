package Zd2;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int choice = 0, resultSum = 0,resultMultiply = 1, n = scanner.nextInt();
        do {
            System.out.println("Choose option:\n");
            System.out.printf("1.Sum integer numbers to %d.\n",n);
            System.out.printf("2.Multiply integer numbers to %d.\n",n);
            choice = scanner.nextInt();
        }
        while(choice != 1 && choice !=2);
        if(choice == 1)
        {
            for (int i = 0; i <= n; i++)
                resultSum+=i;
            System.out.printf("Result of summing integer numbers to number %d is %d", n , resultSum);
        }
        if(choice == 2)
        {
            for(int i =1 ;i <= n; i++)
                resultMultiply*=i;
            System.out.printf("Result of multiplication integer numbers to number %d is %d", n , resultMultiply);
        }
    }
}
