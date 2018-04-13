package Zd3;

public class MultiplicationTable {
    public static  void  main(String[] args)
    {
        int[] array1 = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] array2 = array1;

        for(int i=0;i<array1.length; i++)
        {
            for(int j=0;j<array2.length;j++)
                System.out.printf("%d\t",array1[i] * array2[j]);
            System.out.println();
        }
    }
}
