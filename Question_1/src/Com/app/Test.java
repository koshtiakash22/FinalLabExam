package Com.app;

public class Test {
	public static void main(String []args)
	{
		System.out.println("Flat 1 :- ");
		TwoBHK Flat1 = new TwoBHK(10.2f,20.5f,1000000,10);
		Flat1.show();
		
		System.out.println("Flat 2 :- ");
		TwoBHK Flat2 = new TwoBHK(9.2f,15.5f,800000,10);
		Flat2.show();
		
		System.out.println("Flat 3 :- ");
		TwoBHK Flat3 = new TwoBHK(10.0f,12.5f,500000,10.2f);
		Flat3.show();
		
		long Total;
		
		Total= Flat1.price + Flat2.price + Flat3.price;
		System.out.println("Total Amount Of Flats is "+Total+"Rs");
		
		
	}
	
}
