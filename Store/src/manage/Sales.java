package manage;

import java.util.*;

public class Sales {
	List<Stock> s;
	Scanner t;



public Sales(){
	this.s= new ArrayList<>();
	this.t=new Scanner(System.in);
	
	
}


// TO ADD ITEM IN THE LIST
public void add() {
	// TODO Auto-generated method stub
	int code=0;;
	String name="";
	float Cost=0;
	int Quant;
	System.out.println("Enter product code!");
	code=t.nextInt();
	System.out.println("Enter name of the product");
	name=t.next();
	System.out.println("Enter cost ");
	Cost=t.nextFloat();
	System.out.println("Enter quantity ");
	Quant=t.nextInt();
	Stock d= new Stock(code,name,Cost,Quant);
	s.add(d);
	
	
}

// TO SEARCH FOR PARTICULAR PRODUCT

public void searchProduct() {
	// TODO Auto-generated method stub
	
	System.out.println("Enter product whose details you want to Search");
	String name=t.next();

	
	for(Stock i:s) {
		if(name.equals(i.getname())) {
			System.out.println(i);
			
		
	}
	
	
}




	
	
}

// FOR UPDATING ITEM LIST

public void update() {
	
	// TODO Auto-generated method stub
	
	System.out.println("Enter product name whose details you want to update:");
	String name=t.next();
	int index=0;
	for(Stock i:s) {
		if(name.equals(i.getname()))
		{
			index=s.indexOf(i);
			
			break;
		}
	}
	int code=0;
	String nam="";
	float cos=0;
	int quan=0;
	System.out.println("Enter product code! Integer 3 digit type only");
	code=t.nextInt();
	System.out.println("Enter name of the product");
	nam=t.next();
	System.out.println("Enter cost per item");
	cos=t.nextFloat();
	System.out.println("Enter quantity being added to stock");
	quan=t.nextInt();
	Stock d= new Stock(code,nam,cos,quan);
	s.set(index, d);
	
	
}

//FOR BILLING 

public void bill() {
	int code=0;
	int quant=0;
	float price=0;
	
	System.out.println("Enter code of product to search");
	code=t.nextInt();
	for(Stock i:s) {
		if(code==i.getcode()) {
			System.out.println(i);
			System.out.println("Enter quantity required");
			quant=t.nextInt();
			System.out.println("your bill is Rs");
			price=quant*i.getCost();
			System.out.println(price);
			
		}
		else {
			System.out.println("Invalid product code");
		}
	}
	
	
}
	
}

