import java.io.*;
import java.util.*;
class Numcount
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	int count=1;
	for(int i=0;i<a.length();i++)
	{
	    if(a.charAt(i)=='.')
	    {
		count++;
	     }
	}
	System.out.println(count);
}}
