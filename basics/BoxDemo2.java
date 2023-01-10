class Box {
	double width;
	double height;
	double depth;
}
class BoxDemo2 
{
	public static void main(String args[]) 
	{
		Box  b1 = new Box();
		Box  b2 = new Box();
		double vol;
		b1.width = 10;
		b1.height = 20;
		b1.depth = 15;
		b2.width = 3;
		b2.height = 6;
		b2.depth = 9;
		vol = b1.width * b1.height * b1.depth;
		System.out.println(vol);
		vol = b2.width * b2.height * b2.depth;
		System.out.println(  vol);
	}
}