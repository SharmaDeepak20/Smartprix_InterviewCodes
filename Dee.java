import java.util.Scanner;

public class Dee 
{
    public static void main(String[] args) 
    {
	   Scanner sc=new Scanner(System.in);
	   
	   String str2=" ";
	   int count=0;
	   System.out.println("Enter Replacement String");
	   String str=sc.nextLine();
	   
	   System.out.println("Enter Positional Array");
	   String str1=sc.nextLine();
	   
	   String arr1[]=str.split(" ");
	   String arr2[]=str1.split(" ");
	   	   
	   
	   for(int i=0;i<arr2.length;i++)
	   {
		   if(arr2[i].equals("{}"))
		   {
			   str2=str2+" "+arr1[count];
			   count++;
		   }
		   else
		   {
			   if(arr2[i].charAt(0)=='{' && arr2[i].charAt(2)=='}')
			   {
				   int res=Integer.parseInt(""+arr2[i].charAt(1));
				   //System.out.println(res);
				   str2=str2+" "+arr1[res]; 
			   }
			   else
			   {
			     str2=str2+" "+arr2[i];
			   }
		   }
	   }
	   
	   System.out.println(str2.trim());
	}
}
