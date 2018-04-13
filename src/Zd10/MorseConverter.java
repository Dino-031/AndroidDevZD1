package Zd10;

import java.util.Objects;
import java.util.Scanner;

public class MorseConverter {
    public static void main(String[] args)
    {
        char[] EngLetters = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String[] MorseLetters = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine();
        if(input.charAt(0) != '-' && input.charAt(0) != '.')
            ConvertToMorse(input,EngLetters,MorseLetters);
        else
            ConvertToEng(input,EngLetters,MorseLetters);
    }

    private static void ConvertToMorse(String input,char[] eng, String[] morse)
    {
        for(int i = 0;i<input.length();i++)
        {
           for(int j=0;j<eng.length;j++)
           {
               if(input.charAt(i) == eng[j])
                   System.out.printf("%s ",morse[j]);
           }
        }
    }

    private static void ConvertToEng(String input,char[] eng, String[] morse)   //Pri unosu moresove abecede nakon svakog znaka, pa cak i nakon zadnjeg znaka u stringu, potrebno je upisati razmak, a rijeci se odvajaju znakom /
    {                                                                           // NPR unos".- -.../-... .- " za rezultat ce dati "ab ba"
        String letter="";

        for(int i = 0;i<input.length();i++)
        {
            if (input.charAt(i) != ' ' && input.charAt(i) != '/')
            {
                letter+=input.charAt(i);
            }
            else if(input.charAt(i) == ' ' || input.charAt(i) =='/')
            {
                if(input.charAt(i) == ' ')
                {
                    for(int j = 0;j<morse.length;j++)
                    {
                        if(Objects.equals(letter,morse[j]))
                            System.out.printf("%s",eng[j]);
                    }
                    letter = "";
                }
                else if(input.charAt(i) =='/')
                {
                    for(int j = 0;j<morse.length;j++)
                    {
                        if(Objects.equals(letter,morse[j]))
                            System.out.printf("%s",eng[j]);
                    }
                    letter = "";
                    System.out.printf(" ");
                }

            }

        }
    }

}
