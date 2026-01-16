package Ch6_Class;

public class BoxDemo3 {

	public static void main(String[] args) {
		Box3 mybox1= new Box3();
		Box3 mybox2= new Box3();
		double volume;
		
		volume=mybox1.CalVolume();
		System.out.println("Volume of mybox1: "+volume);
		
		volume=mybox2.CalVolume();
		System.out.println("Volume of mybox2: "+volume);

	}

}
