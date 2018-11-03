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
		    int a2[][]=new int[n][2];
		    int b2[][]=new int[n][2];
		    int c=sc.nextInt();
		    int d=sc.nextInt();
		    int sum=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		        a2[i][1]=i;
		    }
		    for(int i=0;i<n;i++)
		    {
		        b[i]=sc.nextInt();
		        b2[i][1]=i;
		    }
		    for(int i=0;i<n;i++)
		    {
		        sum+=Math.max(a[i], b[i]);
		        if(a[i]>b[i])
		        {
		            a2[i][0]=a[i]-b[i];
		            b2[i][0]=-1;
		        }
		        else if(a[i]==b[i])
		        {
		            a2[i][0]=0;
		            b2[i][0]=0;
		        }
		        else
		        {
		            b2[i][0]=b[i]-a[i];
		            a2[i][0]=-1;
		        }
		    }
		    Arrays.sort(a2, (a3, b3) -> Integer.compare(a3[0], b3[0]));
		    Arrays.sort(b2, (a4, b4) -> Integer.compare(a4[0], b4[0]));
		    for(int i=0;i<n;i++)
		    {
		        System.out.println(a2[i][0]+" "+a2[i][1]);
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.println(b2[i][0]+" "+b2[i][1]);
		    }
		    System.out.println(sum);
		    
		    
		}
	}
}