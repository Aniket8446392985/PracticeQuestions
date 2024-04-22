public class Diamondpattern
{
    public static void main(String[] args)
    {
        int reduced = 1;
        for (int i = 0; i <= 4; i++)
        {
            int fac = i % 2;
            if (fac == 0 || i == 0)
            {
                for (int space = reduced; space >= 0; space--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                if (i < 4) {
                    System.out.println();
                }
                reduced--;
            }

        }

        System.out.println();

        int reduced1 = 0;
        for (int i = 3; i >=0; i--)
        {
            int fac = i % 2;
            if (fac == 0 || i == 0)
            {
                for (int space = 0; space <= reduced1; space++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                if (i < 4) {
                    System.out.println();
                }
                reduced1++;
            }

        }



















    }
}
