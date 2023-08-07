package com.phone;

public class FactoryMain {

	public static void main(String[] args) {
		
		// even if you have extra class in future, it will not change the client application that time it will change this class only.
		OperatingSystemFactory osf = new OperatingSystemFactory();
		
		OS obj = osf.getInstance("Open");
		obj.spec();
		
		/*
		 
		// without using factory design pattern
		
		OS obj = new Windows(); 
		
		// but we are providing impl. here itself, 
		// if we change in future impl. i.e. Windows to OS that means we need to recompile this so our client knows which classes we are working.
		// bcz we are exposing the windows keyword here.
		// what factory pattern says instead of creating a class directly, create a class that will give the object of those OS
		
		obj.spec();
		
		*/
	}

}
