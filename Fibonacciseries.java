package week1day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=0;
       int n2=1;
       int sum;
       int count=8;
       int i;
       System.out.println(n1+""+n2);
       for(i=1;i<8;i++) {
    	   sum=n1+n2;
    	   System.out.println(" " +sum);
    	   n1=n2;
    	   n2=sum;		
       }
	}

}
