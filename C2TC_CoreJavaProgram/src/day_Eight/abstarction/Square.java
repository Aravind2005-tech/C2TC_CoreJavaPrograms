package day8.abstarction;
public class Square extends Shape{
	private float side;
	public Square()
	{
		side=2.0f;
	}
	public Square(float side)
	{
		this.side=side;
	}
	

	void calArea() {
		super.area=side*side;		
	}
}
