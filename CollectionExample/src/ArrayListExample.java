import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Elements in the list");
		al.add(1);al.add(2);al.add(3);al.add(4);al.add(5);al.add(6);
		System.out.println(al);
		
		for(int i:al) {
			System.out.print(i);
		}
		System.out.println("");
		System.out.println("Using Iterator");
		Iterator it=al.iterator();
		while(it.hasNext()) {
			int i=(Integer)it.next();
			System.out.print(i);
		}
		
	}

}
