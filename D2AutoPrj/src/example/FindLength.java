package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class FindLength {
	
	public static void main(String []args)
	{
		int []a= new int[3];
		System.out.println("The lenght of the array is "+a.length);
		ArrayList<String> al=new ArrayList<String>();
		al.add("open");
		al.add("text");
		System.out.println("Length of the array is "+al.size());
		
		
		List arList = new ArrayList<>();
		arList.add(10);
		arList.add(20);
		arList.add(30);
		arList.add(40);
		Iterator itr=arList.iterator();
		while(itr.hasNext())
		{
			System.out.println("The elements are "+itr.next());
		}
		Collections.reverse(arList);
		Iterator itr2 = arList.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		//reverse and sort
		
		List orderedList = new ArrayList<>();
		orderedList.add(10);
		orderedList.add(40);
		orderedList.add(20);
		orderedList.add(340);
		orderedList.add(110);
		orderedList.forEach((temp)-> {System.out.println("temp "+temp);});
		
		
		
		Iterator orderedIterator = orderedList.iterator();
		while(orderedIterator.hasNext())
		{
			System.out.println("The arraylist is "+orderedIterator.next());
		}
		Comparator cmp = Collections.reverseOrder();
		Collections.sort(orderedList, cmp);
		//Collections.sort(orderedList, cmp);
		Iterator orderedIterator1 = orderedList.iterator();
		while(orderedIterator1.hasNext())
		{
			System.out.println("The Ordered List in Descending Order "+orderedIterator1.next());
			
		}
	}

}
