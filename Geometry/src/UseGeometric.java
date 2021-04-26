public class UseGeometric
{
	public static void main(String[] args)
	{
		double area;
		double Height;
		double Width;
		String figuretype;
		
		GeometricFigure[] figure = new GeometricFigure[4];
		figure[0] = new Square(2, 1, "Square");
		figure[1] = new Triangle(3, 2, "Triangle");
		figure[2] = new Square(4, 3, "Square");
		figure[3]= new Triangle(5, 4, "Triangle");

		for(int i = 0; i < figure.length; i++)
		{
				Height = figure[i].getheight();
				Width = figure[i].getwidth();
				figuretype = figure[i].getfigure();
				area = figure[i].Area(Height, Width);
				System.out.println( figuretype + " Height: " +
				Height + ", Width:" + Width + ",  "
						+ "area: " + area);
		}
	}
}