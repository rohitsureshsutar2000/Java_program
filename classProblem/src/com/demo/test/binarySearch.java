package com.demo.test;

public class binarySearch {
	public static int BiSearch(int first,int last,int search,int[] arr)
	{
		int mid=(first+last)/2;
		
			if(first>=last)
			{
				return -1;
			}
			else {
				if (arr[mid]==search)
				{
					return mid;
				}
				else if(arr[mid]<search)
				{
					return BiSearch(mid+1,last,search,arr);
				}
				else
				{
					return BiSearch(first,mid-1,search,arr);
				}
			}
		
		
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,9,11,26};
		int search=11;
		int first=0,last=arr.length;
		System.out.println(BiSearch(first,last,search,arr));
		

	}

}
