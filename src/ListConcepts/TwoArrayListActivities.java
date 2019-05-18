package ListConcepts;

import java.util.ArrayList;

public class TwoArrayListActivities {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Biswadeep");
		ar1.add("Ahaan");
		ar1.add("Priya");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Biswadeep1");
		ar2.add("Ahaan2");
		ar2.add("Priya1");
		
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Biswadeep1");
		ar3.add("Ahaan1");
		ar3.add("Priya1");
		
		ar1.removeAll(ar2);
		System.out.println("The array size is "+ar1.size());
		for (int i=0;i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		
		ar1.addAll(ar2);
		System.out.println("The array size is "+ar1.size());
		for (int i=0;i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		
		//removeAll will remove all the common values from first array along with the values of second array
		ar1.removeAll(ar3);
		System.out.println("The array size is "+ar1.size());
		for (int i=0;i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		
		ar2.retainAll(ar3);
		System.out.println("The retained array size is "+ar1.size());
		for (int i=0;i<ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
	}

}
