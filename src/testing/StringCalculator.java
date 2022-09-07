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
	public int stringcalculate(String input)
	{
		if(isEmpty(input))
		{
			return 0; 
		}
		return Integer.parseInt(input);
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//
//	}

}
