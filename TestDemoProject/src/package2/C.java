package package2;
import package1.*;

public class C {
	
	public String publicMessage = "This is public";
	protected String protectedMessage = "This is protected";
//		something that is protected is accessible to a different class in a different package as long as that class is a subclass of the class that contains that protected member
		   String defaultMessage = "This is the default";
	private String privateMessage = "This is the private";
//		something only visible to the class that it contains itself	
}
