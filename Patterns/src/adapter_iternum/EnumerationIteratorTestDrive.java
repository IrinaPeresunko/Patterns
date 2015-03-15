package adapter_iternum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		String[] array={"a","b","c"};
		Vector v = new Vector(Arrays.asList(array));
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
