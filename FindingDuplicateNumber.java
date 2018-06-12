import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[]{1,5,5,6,7,89,3,3,6};
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			int counter=0;
			//hm.put(arr[i], counter);
			
			if(!(hm.containsKey(arr[i])))
			{
				counter++;
				hm.put(arr[i],counter);
			}
			else
			{
				int val=hm.get(arr[i]);
				hm.put(arr[i], ++val);
			}
				
		}
		Set<Integer> setIterator=hm.keySet();
		Iterator<Integer> itt=setIterator.iterator();
		while(itt.hasNext())
		{
			Integer keyValue=itt.next();
			
			
			System.out.println("Value:"+hm.get(keyValue)+"Key:"+keyValue);
		}
		
		
		
		
		//Multiple Iterations//Two for loops//Inefficient way //Complexity is O(log n) something
		/*ArrayList<Integer> al= new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			
				if(arr[i]==arr[j])
				{
					al.add(arr[i]);
				}
			}	
		}
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		/*for(int i =0;i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.println("i:"+i);
				System.out.println("j:"+j);
				if(arr[i]==arr[j])
				{
					System.out.println("ii:"+i);
					System.out.println("jj:"+j);
					al.add(arr[i]);
				}
				
			}
		}
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/

	}

}
