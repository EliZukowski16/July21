package com.zukowski;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{	
		for (int i = 110; i > 0; i--) 
		{		
			if(((i % 3) == 0) && ((i % 5) == 0) && ((i % 7) == 0))
			{
				System.out.println("Fizz Buzz Bang ");
			}
			else if(((i % 3) == 0) && ((i % 5) == 0))
			{
				System.out.println("Fizz Buzz ");
			}
			else if(((i % 3) == 0) && ((i % 7) == 0))
			{
				System.out.println("Fizz Bang ");
			}
			else if(((i % 5) == 0) && ((i % 7) == 0))
			{
				System.out.println("Buzz Bang ");
			}
			else if((i % 3) == 0)
			{
				System.out.println("Fizz ");
			}
			else if((i % 5) == 0)
			{
				System.out.println("Buzz ");
			}
			else if((i % 7) == 0)
			{
				System.out.println("Bang ");
			}
			else
			{
				System.out.println(i);
			}	
		}
	}
}
