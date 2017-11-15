package People;

import java.util.ArrayList;

public class PeopleObjects {
	
	ArrayList<People> arrayList;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PeopleObjects people = new PeopleObjects();

		
		People p = new People("fayez","abc",23);
		People q = new People("harry","xyz",32);
		People r = new People("bob","egg",55);
		
		ArrayList<People> a = new ArrayList<>();
		
		a.add(p);
		a.add(q);
		a.add(r);
		
	System.out.println(people.getPeople("fayez", a));
		
		}
	
		public People getPeople(String name, ArrayList<People> a) {
		
			for(People P : a) {
		
				if(P.getName().equals(name)) {
		
					//System.out.println(P);
					return P;
				}
			}
			return null;
		}


}
