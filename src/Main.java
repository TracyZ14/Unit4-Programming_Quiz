public class Main
{
    public static void main(String[] args)
    {
        System.out.println(hasPattern("TAN"));
        System.out.println(hasPattern("AARDVARK"));
        System.out.println(hasPattern("ABABAB"));
        System.out.println(hasPattern("BOZO"));

        System.out.println(swapLetters("TAN"));
        System.out.println(swapLetters("ARARBBAA"));
        System.out.println(swapLetters("AZAZAPCSA"));
        System.out.println(swapLetters("BOZO"));
    }

    public static boolean hasPattern(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.indexOf("A") == i)
            {
                return true;
            }
        }
        return false;
    }

    public static String swapLetters(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            String letter = word.substring(i, i + 1);
            if(letter.equals("A"))
            {
                if((i + 1) == word.length())
                {
                    word = word.substring(0, i) + word.substring(i + 1) + word.substring(i, i + 1);
                }
                else
                {
                    word = word.substring(0, i) + word.substring(i + 1, i + 2) + word.substring(i, i + 1) + word.substring(i + 2);
                }
                i++;
            }
        }
        return word;
    }
}