package Zd4;

import java.util.Calendar;

public class GetLeapYears {
    public static void main(String[] args)
    {
        int i=1,counter=1,year = Calendar.getInstance().get(Calendar.YEAR);
        do
            {
                if((year + i)%4 == 0)
                {
                    if((year + i)%100 ==0)
                    {
                        if((year+ i)% 400 == 0)
                        {
                            System.out.printf("Year %d is a leap year.\n",year+i);
                            counter++;
                        }
                    }
                    else
                    {
                        System.out.printf("Year %d is a leap year.\n",year+i);
                        counter++;
                    }
                }
                i++;
            }
        while(counter<=20);
    }
}
