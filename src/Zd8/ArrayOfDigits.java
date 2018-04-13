package Zd8;

public class ArrayOfDigits {

    public static void main(String[] args)
    {
        int[] arrayOfDigits = ArrayOfDigitsFromInt(1534);
        for(int i = 0;i<arrayOfDigits.length;i++)       //printing backwards
            System.out.printf("%d\t",arrayOfDigits[i]);
    }

    private static int[] ArrayOfDigitsFromInt(int n)
    {
        int temp = n,counter =0;
        do {
            temp/=10;
            counter++;
        }
        while(temp!=0);
        int[] result = new int[counter];
        for(int i=0;i<counter;i++)
        {
            result[i]=n%10;
            n=n/10;
        }
        return  result;
    }
}
