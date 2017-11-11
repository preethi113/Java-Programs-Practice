import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CharacterCount {
	
	void findCount(String str)
	{
		char[] chArray=str.toCharArray();
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		for(int i=0;i<chArray.length;i++)
		{
			int count=0;
			if(!(hm.containsKey(chArray[i])))
			{
				count++;
				hm.put(chArray[i], count);
			}
			else{
				int counterKey=hm.get(chArray[i]);
			hm.put(chArray[i], ++counterKey);
			}
				
		}
		Set<Character> keySets=hm.keySet();
		Iterator<Character> i=keySets.iterator();
		while(i.hasNext())
		{
			Character keyval=i.next();
			
			System.out.println(hm.get(keyval)+":"+keyval);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		CharacterCount obj= new CharacterCount();
		obj.findCount("Mango");
	}

}
