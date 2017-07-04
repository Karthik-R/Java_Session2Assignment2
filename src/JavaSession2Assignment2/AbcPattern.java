package JavaSession2Assignment2;

public class AbcPattern {

	public static void main(String args[]) {
		System.out.println("The Output:");
		char c;
		// this loop prints the top half of the diamond pattern
		for (int i = 1; i <= 3; ++i)
		{
			c = 'a';
			for (int j = i; j < 3; ++j) // for loop to print spaces
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; ++k) // this loop prints the alphabets from starting
			{
				System.out.print(c);
				++c;
			}
			c -= 2;
			for (int l = 1; l < i; ++l) // this loop prints the alphabets from reverse
			{
				System.out.print(c);
				--c;
			}
			System.out.println();
		}
		
		// this loop prints the other half of the diamond pattern
		for (int i = 2; i >= 1; --i)
		{
			c = 'a';
			for (int j = i; j < 3; ++j) // for loop to print spaces
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; ++k) // this loop prints the alphabets from starting
			{
				System.out.print(c);
				++c;
			}
			c -= 2;
			for (int l = 1; l < i; ++l) // this loop prints the alphabets from reverse
			{
				System.out.print(c);
				--c;
			}
			System.out.println();
		}

	}

}
