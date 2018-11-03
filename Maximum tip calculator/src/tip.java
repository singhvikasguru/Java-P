/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class tip {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int j=0;j<T;j++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[n];
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        b[i]=sc.nextInt();
		    }
		    for(int i=0;i<n;i++)
		    {
		        sum+=Math.max(a[i], b[i]);
		    }
		    System.out.println(sum);
		}
	}
}