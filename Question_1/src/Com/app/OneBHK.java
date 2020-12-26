package Com.app;

public class OneBHK {
	float RoomArea , HallArea;
	long price;
	
	public OneBHK()
	{
		RoomArea = 0;
		HallArea = 0;
		price = 0;
	}
	
	public OneBHK(float RoomArea, float HallArea, long price)
	{
		this.RoomArea= RoomArea;
		this.HallArea= HallArea;
		this.price= price;
	}
	
	public void show()
	{
		System.out.println("RoomArea = "+RoomArea);
		System.out.println("HallArea = "+HallArea);
		System.out.println("price = "+price+"Rs");
	}

}
