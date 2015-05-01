package adapter_iternum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		String[] array={"a","b","c"};
		Vector<String> v = new Vector<String>(Arrays.asList(array));
		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
