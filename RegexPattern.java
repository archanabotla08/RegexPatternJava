import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegexPattern {
	Scanner sc = new Scanner(System.in);

	public String validateFirstName() {
		System.out.println("Enter first Name: ");
		String firstName = sc.next();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
		String result = (b) ? "valid" : "invalid" ;
		return result;
	}
	public String validateLastName() {
		System.out.println("Enter Last Name: ");
		String lastName = sc.next();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
		String result = (b) ? "valid" : "invalid" ;
		return result;
	}
	public static void main(String[] args) {
//		System.out.println("Welcome Master");
		RegexPattern reg = new RegexPattern();
		System.out.println("FirstName is : " + reg.validateFirstName());
		System.out.println("Lastname is : " + reg.validateLastName());
	}

}
