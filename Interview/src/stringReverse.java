
public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My name is Sandipan";
		
		String []revstr=str.split(" ");
		
		int l=revstr.length;
		for(int i=l-1;i>=0;i--)
			
			System.out.print(revstr[i]+" ");
			
		
	}

}
