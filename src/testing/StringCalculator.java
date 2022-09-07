package testing;

public class StringCalculator {

	private boolean isEmpty(String input)
	{
		int len=input.length();
		if(len==0)
		{
			return true;
		}
		return false;
	}
	private int getSum(String[] num)
	{
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+Integer.parseInt(num[i]);
		}
		return sum;
	}
	
	public int add(String input)
	{
		String [] num=input.split(",");
		if(isEmpty(input))
		{
			return 0; 
		}
		if(num.length==1)
		{
			return Integer.parseInt(num[0]);
		}
		else
		{
			return getSum(num);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}

}
