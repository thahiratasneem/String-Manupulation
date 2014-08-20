import java.util.Scanner;


public class string {
	public static void main(String args[]) 
	{
	
		StringBuffer str=new StringBuffer("thahira");
		//System.out.println("enter the name " );

		//Scanner s=new Scanner(System.in);
        //String str;
        //str =s.nextLine();
		System.out.println(" the name is " +str);
		for(int i=0;i<str.length();i++)
		{
		System.out.println("character at position :"  + "is  " +str.charAt(i) );
		}
		
				//str.setCharAt(3,'*');
				//str.append("tasneem");
     str.insert(5,"sneem");
	System.out.println("name is " +str);

	}
}





//copy names from one string to another	
		
/*String [] str ={"thahira ","tasneem","meena","madhu","dowlath"};
for(int i=0;i<str.length;i++)
{
System.out.println(" the names are  " + str[i]);
}
System.out.println("\n");

String  str1 []=new String [5];
for(int i=0;i<str.length;i++)
{
	str1[i]=str[i];

	System.out.println(" the copied names are  " + str1[i]);

}
	
	}
	}*/


    // get the length of the string 
//		System.out.println("" + str.length());
		
		//display names one by one 
		 
		 
	/*	for(int i=0;i<str.length();i++)
		{
			//System.out.println("character at position :"  + "is  " +str.charAt(i) );

		
		char n = str.charAt(i);
		char n1 = str1.charAt(i);

		if(  i%2==0)
			{	
			//str1[i]=str[i];
			System.out.println("alternate no :" +n);
			System.out.println("Test :" +n1);

			}

}
}}
		
		//reverse
		/*for(int j=str.length()-1;j>=0;j--)
		{
			System.out.println(" \n character at position :"  + "is  " +str.charAt(j) );

		}*/

		//StringBuffer str=new StringBuffer("thahira");
		//System.out.println(" the string is  "+ str);
		

