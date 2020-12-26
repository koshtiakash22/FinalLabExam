package Com.app;

public class TwoBHK extends OneBHK {
	float Room2Area;
	
	public TwoBHK()
	{
		super();
		Room2Area=0;
	}
	
	public TwoBHK(float RoomArea, float HallArea, long price,float Room2Area)
	{
		super(RoomArea ,HallArea, price);
		this.Room2Area=Room2Area;
	}
	
	public void show()
	{
		System.out.println("RoomArea = "+RoomArea);
		System.out.println("HallArea = "+HallArea);
		System.out.println("Room2Area = "+Room2Area);
		System.out.println("price = "+price+"Rs");
		
	}

}
