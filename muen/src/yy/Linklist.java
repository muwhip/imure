package yy;

import java.util.LinkedList;
import java.util.Iterator;
public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al=new LinkedList<String>();
		al.add("Huseen");
		al.add("faarax");
		al.add("mahamuud yuusuf");
		al.add("hodan");
		al.add("hodan");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
