package JavaStatic;

public class StaticBlock {
	  public static void main(String[] args) {
	    
	  }
	 
	  static {
	    String os = System.getenv("OS");
	    
	    if (os.equals("Windows_NT") == true) {
	    	System.out.println("You are using Windows operating system.");
	      System.exit(1);
	    }
	  }
	}