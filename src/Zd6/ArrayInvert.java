package Zd6;

public class ArrayInvert {

    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] array1 = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int[] result=ReverseArray(array);
        int[] result1 =ReverseArray(array1);

        for(int i=0;i<array.length;i++)
            System.out.printf("%d\t",array[i]);
        System.out.printf("\n\n");
        for(int i=0;i<array1.length;i++)
            System.out.printf("%d\t",array1[i]);
    }
    private static int[] ReverseArray(int[] array)
    {
        int arrayPosition = array.length -1;
            for(int i =0; i<=arrayPosition/2;i++)
            {
                int temp = array[i];
                array[i] = array[arrayPosition-i];
                array[arrayPosition-i] = temp;
            }
        return array;
    }
}
