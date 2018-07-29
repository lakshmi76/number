class Amint
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

        int low ,high;
        Scanner sc=new Scanner(System.in);
        low=sc.nextInt();
        high=sc.nextInt();

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }
                        if (result == number)
                System.out.print(number + " ");
        }
    }
}

