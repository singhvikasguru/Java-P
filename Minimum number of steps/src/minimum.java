/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class minimum {
	public static void main (String[] args) {
		//code
		System.out.println("Give Inputs");
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=0;i<T;i++)
		{
		    int a=sc.nextInt();
		    int n[]=new int[a];
		    for(int j=0;j<a;j++)
		    {
		        n[j]=sc.nextInt();
		    }
		    
		    int n2[]=new int[a];
		    for(int j=0;j<a;j++)
		    {
		        n2[j]=j+n[j];
		    }
		    //int n3[]=new int[a];
		    int counter=0;
		    int max=n[0];
		    int max2=max;
		    int res=0;
		    while(counter<a)
		    {
		        res+=1;
		        for(int j=counter;j<max;j++)
		        {
		            if(j>=a)
		            {
		                max=a;
		                break;
		                
		            }
		            
		            if(n2[j]>max2)
		                max2=n[j];
		        }
		        
		        counter=max;
		        max+=max2;
		        if(max>a)
		        	break;
		        System.out.println("max2 = "+max2+" max = "+max);
		    }
		    System.out.println(res);
		}
		
	}
}