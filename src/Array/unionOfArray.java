package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionOfArray {

	public static void main(String[] args) {
		int arr1[] = {7, 1, 5, 2, 3, 6} ;
		int arr2[] = {3, 8, 6, 20, 7} ;
		union(arr1, arr2);
	}
	
	public static void union(int[] arr1,int[] arr2) {
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			hs.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			hs.add(arr2[i]);
		}
		System.out.println(hs.toString());
		ArrayList<Integer> ll=new ArrayList<>(hs);
		Collections.sort(ll);
//		System.out.println(ll.toString());
		
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
