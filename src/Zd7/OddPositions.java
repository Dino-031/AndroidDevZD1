package Zd7;

import java.util.ArrayList;
import java.util.List;

public class OddPositions {

    public static void main(String[] args)
    {
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11};
        List<String> result = ReturnOddPositionedValues(array);
        for(int i =0;i<result.size();i++)
            System.out.printf("%s\t",result.get(i));
    }

    private static List<String> ReturnOddPositionedValues(int[] array)
    {
        List<String> OddPositionValues = new ArrayList<String>();
        for(int i=0;i<array.length;i++)
        {
            if(i%2!=0)
            {
                OddPositionValues.add(String.valueOf(array[i]));
            }

        }
        return OddPositionValues;
    }
}
