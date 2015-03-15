package adapter_iternum;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		String[] array={"a","b","c"};
		ArrayList l = new ArrayList(Arrays.asList(array));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
