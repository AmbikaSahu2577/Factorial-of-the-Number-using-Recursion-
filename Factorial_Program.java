class Factorial_Program

{
	int fact = 1;
    public static void main(String[] args) 
    {
    	int no = 5,res;
    	Factorial_Program fp = new Factorial_Program();
    	res=fp.Cal_Fact(no);
    	System.out.println("Factorial = "+res);
    }

    int Cal_Fact(int no)
    {
       if (no>1) 
       {
       	fact=fact*no;
       	Cal_Fact(no-1);
       }
       return fact;
    }	
}
