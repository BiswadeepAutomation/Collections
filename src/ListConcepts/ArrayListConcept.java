package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListConcept {

	public static <E> void main(String[] args) {

		//ArrayList is a dynamic array unlike a fixed array (size is fixed)
		//AL can contain duplicate values
		//AL maintains insertion order (indexing)
		// AL is not synchronized (That is why AL is slow as compared to other collections)
		//AL allows random access to fetch any elemnts (stores values as index)
		
		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		
		ar.add(50);
		ar.add("Biswadeep");
		
		System.out.println(ar.size());
		
		for (int i=0; i<ar.size(); i++) {
			System.err.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(50);
		//ar1.add("Biswadeep"); - Not Allowed
		
		ArrayList<E> ar3 = new ArrayList<E>();

		
		
		//non generics vs generics
		//Non generic -- ArrayList ar = new ArrayList(); - This is non generic as any data type can be stored in this arraylist
		//Generic - ArrayList<Integer> ar1 = new ArrayList<Integer>(); - Only integer data type can be added

		

		Employee e1 = new Employee("Biswadeep", 30, "Dev");
		Employee e2 = new Employee("Biswadeep1", 31, "Dev2");
		Employee e3 = new Employee("Biswadeep2", 28, "Dev3");

		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//itrator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.err.println(emp.name);
			System.err.println(emp.age);
			System.err.println(emp.dept);

		
		}
		
		
		
		
		
		
		
		
	}

}
