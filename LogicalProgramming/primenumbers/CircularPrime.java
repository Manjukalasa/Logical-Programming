package com.java.primenumbers;
public class CircularPrime
{
		public static int prime(int num)
		{
			int a=num;
			int c1=0;
			int temp=1;
			while(a!=0)
			{
				c1++;
				temp=temp*10;
				a=a/10;
			}
			int c=0;
			int c2=0;
			while(num!=0)
			{
				if(c2<c1)
				{
					for(int i=2;i<=num-1;i++)
					{
						if(num%i==0)
						{
							c++;
						}
					}
						int rem=num%10;
						num=num/10;
						num=rem*(temp/10)+num;
				}
				else
				{
					num=0;
				}
				c2++;
			}
			if(c==0)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("Not a prime number");
			}
			return a;
		}
	public static void main(String[] args) 
	{
		prime(113);  //   P 
		prime(23);  //  N p
		prime(1193);//    P
	}
	}
