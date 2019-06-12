
public class Prime1 {
public static void main(String args[]) {
	int i=1, n=2;
int count=0;


	while(i<=n)
	{
		if(n%i==0)
		{
			count=count++;
			
		}
			i=i+1;
			
	}

if(count==0)
{
	System.out.println("prime"+count);
	
}
else
{
	System.out.println("not prime");
}
}
}