package prog;

public class CountOccurences
{
	public static void main(String args[]) 
	{

		String input = "111233114";
		char[] ch =input.toCharArray();             // Character to search is 'a'.
		for(char c: ch) {

			int count=0;
			for(int i=0; i<input.length(); i++)
			{
				if(input.charAt(i) == c)
					count++;
			}

			System.out.println("The Character '"+c+"' appears "+count+" times.");
		}
	}
}
