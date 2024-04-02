package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		List l= new ArrayList();
		l.add(1);
		l.add(2);
		l.add(3);
		
		l.add(3,4);
		l.add(4,4);
		System.out.println(l);
	}

}
