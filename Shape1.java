class TwoDShape{
	private double width;
	private double height;
	
	TwoDShape(){
		width = height = 0.0;
	}
	TwoDShape(double w, double h){
		width = w;
		height = h;
	}
	TwoDShape(double x){
		width = height = x;
	}
	double getwidth()		{return width;}
	double getheight()		{return height;}
	void setwidth(double w)	{width = w;}
	void setheight(double h){height = h;}
	
	void showDim(){
		System.out.println("Width and height are " + width + " and " + height);
	}
}
	
class Triangle extends TwoDShape{
	private String style;

	Triangle(){
		super();
		style = "none";
	}
	Triangle(String s, double w, double h){
		super(w,h);
		style = s;
	}
	Triangle(double x){
		super(x);
		style = "filled";
	}
	double area(){
		return getwidth() * getheight() / 2;
	}
	void showStyle(){
		System.out.println("Triangle is " + style);
	}
}
class ColorTriangle extends Triangle{
	private String color;
	ColorTriangle(String c, String s, double w, double h){
		super(s,w,h);
		color = c;
	}
	String getColor(){
		return color;
	}
	void showColor(){
		System.out.println("Color is " + color);
	}
}
class Shape1{
	public static void main (String args[]){
		ColorTriangle t1 = new ColorTriangle("Blue", "outlined", 8.0, 12.0);
		ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
		
		System.out.println("Infor for t1: ");
		t1.showStyle();
		t1.showDim();
		t1.showColor();
		System.out.println("Area is " + t1.area());

		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		t2.showColor();
		System.out.println("Area is " + t2.area());
	}
}
