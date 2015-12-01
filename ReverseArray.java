public class ReverseArray 
{
	public static void printArray(int list[])
	{
		for (int i=0; i<list.length; i++)
		{
			System.out.print(list[i] + ", ");
		}
		System.out.println("");
	}


	public static void reverse(int list[])
	{
		int countDown = list.length - 1;
		
		for (int i=0; i <= countDown; i++)
		{
				int hold = list[i];
				list[i] = list[countDown];
				list[countDown] = hold;
				countDown--;
				System.out.println(countDown);
		}
		return;
		}



	public static void main(String[] args) 
	{

		int list[] = {5, 6, 3, 1, 10, 7, 8, 11, 201, 198, 43};

		System.out.println("Original list:");
		printArray(list);

		reverse(list);

		System.out.println("\nReversed list:");
		printArray(list);


	}
}
