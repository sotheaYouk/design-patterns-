package FactoryDesignPattern;

public class AnimalFactory {
	
	 public static Animal getAnimal(String type)
	    {
	        if(type.equalsIgnoreCase("cat"))
	        {
	        	//return the instantiation of the class Cat
	            return new Cat();
	        }
	        else if(type.equalsIgnoreCase("dog"))
	        {
	        	//return the instantiation of the class Dog
	            return new Dog();
	        }
	        else 
	        	return null;
	    }
}
