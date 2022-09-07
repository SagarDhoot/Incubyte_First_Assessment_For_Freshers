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
	
	private int getsum(String[] num)
	{
		return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
	}
	public int stringcalculate(String input)
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
			return getsum(num);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}

}
