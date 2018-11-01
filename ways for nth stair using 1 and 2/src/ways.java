/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ways {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int a=sc.nextInt();
		    int tws=a/2;
		    long res=0;
		    long tres=0;
		    if(a%2==0)
		        tres=1;
		    else
		        tres=a/2+1;
		    res=tres;
		    int c=tws;
		    int c2=a%2;
		    //System.out.println("tres = "+tres);
		    for(int j=a-tws+1;j<=a;j++)
		    {
		       // System.out.println("tres = "+tres);
		        tres=tres*(j*(c--))/((++c2)*(++c2));
		        res+=tres;
		        
		    }
		    long max=(long)Math.pow(10,9)+7;
		    System.out.println(res);
		}
	}
}