public class DiamondPatternCustom
{
        public static void main(String[] args)
        {
            int maxStars= 100;
            int reduced = (maxStars/2)-1;
            for (int i = 0; i <= maxStars; i++)
            {
                int fac = i % 2;
                if (fac == 0 || i == 0)
                {
                    for (int space = reduced; space >= 0; space--) {
                        System.out.print("_");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    if (i < maxStars) {
                        System.out.println();
                    }
                    reduced--;
                }

            }

            System.out.println();

            int reduced1 = 0;
            for (int i = maxStars; i >=0; i--)
            {
                int fac = i % 2;
                if (fac == 0 || i == 0)
                {
                    for (int space = 1; space <= reduced1; space++) {
                        System.out.print("_");
                    }
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    if (i <= maxStars) {
                        System.out.println();
                    }
                    reduced1++;
                }

            }

        }


}
