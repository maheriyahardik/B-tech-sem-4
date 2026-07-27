public class prime1{
	public static void main(String[] args)
	{
		int i,j,count=0;
		for(i=4;i<=100;i++)
		{
			count=0;
			for(j=2;j<i;j++)
			{
				if(i % j == 0)	
				{
					count++	;
				}
			}
			if(count == 2)
			{
				// System.out.println("");
			}
			else
			{
				System.out.println(i+" Number is prime");
			}
		}
	}
}
