package FacadeDesignPattern;

public class ShapeMaker {
	public void circleMaker()
	{
		Circle circle = new Circle();
		circle.draw();
	}
	
	public void squareMaker()
	{
		Square square = new Square();
		square.draw();
	}
}
