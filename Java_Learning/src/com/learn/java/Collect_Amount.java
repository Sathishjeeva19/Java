package com.learn.java;

//Return concept
public class Collect_Amount 
{
	int collectionAmount = 1000;
	
	//int is return type
	public int GetAmount() 
	{
		System.out.println("I have collected amount" + collectionAmount  + " and Sent to you");
		return collectionAmount;
	}

	//main entry point 
	public static void main(String[] args) 
	{
		//ClassName objName = new ClassName;
		Collect_Amount collection = new Collect_Amount();
		
		 Integer collectandgive = collection.GetAmount();
		 System.out.println("Received Amount" + collectandgive);
	}

}
