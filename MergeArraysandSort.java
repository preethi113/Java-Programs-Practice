import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArraysExample {

	public static void main(String[] args) {
		
			Integer[] arr1={1,3,4,8};
			Integer[] arr2={2,5,7,9};
			
			List<Integer> list1=Arrays.asList(arr1);
			
			List<Integer> list2= Arrays.asList(arr2);
			
			List al= new ArrayList();
			al.addAll(list1);
			al.addAll(list2);

			Collections.sort(al);	
			for(int i=0;i<al.size();i++)
			{
				System.out.println(al.get(i));
			}
			
		
			
	}

}
