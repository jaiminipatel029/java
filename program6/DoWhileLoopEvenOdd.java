package program6;

public class DoWhileLoopEvenOdd
{
    public static void main(String[] args)
        {
            System.out.println("The 10 Even Numbers");
            int i = 1;
            do
            {
                System.out.println(2 * i);

            }
            while(++i <= 10);

            System.out.println("The 10 Odd Numbers");
            int j = 1;
            do
            {
                System.out.println(2 * j -1);

            }
            while(++j <= 10);
        }


    }


