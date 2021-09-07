package week1day1;

public class primenumber {

	public static void main(String[] args) {
		int input=12;
		int i;
		int flag=0;
		for(i=1;i<=input;i++)
		{
			if(input%2==0)
			{
			flag	=1;
			}
		}
          if(flag==0)
          {
        	  System.out.println("Prime Number");
          }
          else
        	   System.out.println("Not a prime Number");
	}

}