public class Square extends GeometricFigure
{
	private double area;
	
	public Square(double height, double width, String figure)
	{
		super(height, width, figure);
	}
	public double Area(double height, double width)
	{
			area = (height*width);
			return area;
	}
}