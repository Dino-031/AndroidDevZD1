package Zd5;

public class LargestElementInArray {

    public static void main(String[] args)
    {
        int[] array = new int[]{82,1,5,67,14,22,23,112,8,5,2,0};
        System.out.printf("Largest number in array is %d.",FindLargestElement(array));
    }

    private static int FindLargestElement(int[] array)
    {
        int largestNumber = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i] > largestNumber)
                largestNumber = array[i];
        }
        return  largestNumber;
    }
}
