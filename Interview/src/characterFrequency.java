
public class characterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaabccc";
		
		char ch[]=str.toCharArray();
		
		int f=0;
		
		for (int i=0;i<ch.length;i++)
		{
			f=0;
		
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					 f++;
			}	   
			
			System.out.println("Frequency of "+ch[i]+"="+f); 
			
	     }
		
	}
}
