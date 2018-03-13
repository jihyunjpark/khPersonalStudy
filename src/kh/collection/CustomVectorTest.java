package kh.collection;

import kh.collection.CustomVector;

public class CustomVectorTest {
	
	public static void main(String[] args) {
		CustomVector myVector = new CustomVector(10);
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		
		myVector.add("1");
		myVector.add("2");
		myVector.add("3");
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		System.out.println(myVector.get(2));
		
		myVector.remove("3");
		System.out.println(myVector.toString());
		
		
	}

}
