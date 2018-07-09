import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        Map phonebook = new HashMap();
        
		int n=in.nextInt();
		in.nextLine();
        
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phonebook.put(name,phone);
		}
        
		while(in.hasNext())
		{
			String s=in.nextLine();
            if (phonebook.containsKey(s)) {
              System.out.println(s + "=" + phonebook.get(s));
            }
            else {
              System.out.println("Not found");
            }
		}
	}
}
