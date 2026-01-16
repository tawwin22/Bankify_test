package Ch6_Class;

public class BoxDemo1 {

	public static void main(String[] args) {
		Box1 mybox1= new Box1();
		Box1 mybox2= new Box1();
		double volume;
		mybox1.setDim(10, 20 ,30);
		mybox2.setDim(4, 5, 9);
		
		volume=mybox1.CalVolume();
		System.out.println("Volume of mybox1: "+volume);
		
		volume=mybox2.CalVolume();
		System.out.println("Volume of mybox2: "+volume);

	}

}
