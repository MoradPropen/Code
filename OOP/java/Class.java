package Java;
class Box{
	double width;
	double height;
	double depth;
}
public class Class {
public static void main(String[] args) {
	Box mybox = new Box();
	double vol;
	mybox.width=10;
	mybox.height=10;
	mybox.depth=10;
	vol=mybox.width*mybox.height*mybox.depth;
	System.out.println(+vol);
	
}
}

