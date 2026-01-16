package FileExampleTesting;


	import java.io.FileWriter;   // Import the FileWriter class
	import java.io.IOException;  // Import the IOException class to handle errors

	public class WriteFileTest {
	  public static void main(String[] args) {
	    try {
	      FileWriter myWriter = new FileWriter("bb.txt");
	      myWriter.write("Testing the Java Write File");
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
	}

