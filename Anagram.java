/* Anagram Example 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class AnagramExample {

	public List<Integer> findAnagrams(String s, String p) {
		int n = p.length() - 1;
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < s.length() - n; i++) {
			// System.out.println(s.substring(i,i+p.length()));
			String str1 = s.substring(i, i + p.length());
			hm.put(i, str1);
		}
		Set<Integer> setIterator = hm.keySet();
		Iterator<Integer> i = setIterator.iterator();
		List<Integer> al = new ArrayList<Integer>();
		char[] charArr = p.toCharArray();
		Arrays.sort(charArr);
		while (i.hasNext()) {
			int keyValue = i.next();
			// System.out.println(keyValue+":"+ hm.get(keyValue));
			char[] ch1 = hm.get(keyValue).toCharArray();
			Arrays.sort(ch1);
			// System.out.println(charArr);
			if (Arrays.equals(ch1, charArr))
				al.add(keyValue);

		}
		// System.out.println("---------------");
		/*
		 * TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		 * tm.putAll(hm); Set<> for(Map.Entry<String,Integer>
		 * entry:tm.entrySet()) {
		 * System.out.println(entry.getKey()+":"+entry.getValue()); }
		 */
		/*
		 * Iterator itr=al.iterator(); while(itr.hasNext()){
		 * System.out.println(itr.next()); }
		 */
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramExample ae = new AnagramExample();
		List<Integer> newList = ae.findAnagrams("abab", "ab");
		Iterator itr = newList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
