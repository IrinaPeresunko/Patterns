package adapter_iternum;

import java.util.*;

public class EI {
	public static void main (String args[]) {
		String[] array={"a","b","c"};
		Vector v = new Vector(Arrays.asList(array));
		Enumeration enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		Iterator iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
