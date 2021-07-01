/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm;

import java.util.Scanner;

public class Counting_Sort{

	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		int n=ob.nextInt();
		int a[]=new int[n];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
		a[i]=ob.nextInt();
		min=Math.min(min,a[i]);
		max=Math.max(max,a[i]);
		}
		int b[]=new int[max+1];
		for(int i=0;i<a.length;i++)
		{
		b[a[i]]++;
		}
		for(int i=1;i<b.length;i++)
		{
		b[i]=b[i]+b[i-1];
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(i+" "+b[i]);
		}
		int sorted_array[]=new int[b[b.length-1]];
		for(int i=0;i<a.length;i++)
		{
			int pos=b[a[i]];
		sorted_array[pos-1]=a[i];
		b[a[i]]--;
		}
		for(int i=0;i<sorted_array.length;i++)
		{
			System.out.println(sorted_array[i]);
		}
		
	}
}
