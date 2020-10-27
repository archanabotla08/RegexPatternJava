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
	public String validateEmail() {
		System.out.println("Enter Email Id Name: ");
		String email = sc.next();
		boolean b = Pattern.matches("^[a-zA-Z0-9]+([.+_-]{1}[a-zA-Z0-9]{3,}){0,2}\\@[a-zA-Z0-9]+([.]{1,2}[a-z]{2,}){0,2}", email);
		String result = (b) ? "valid" : "invalid" ;
		return result;
	}
	public String validateMobileNo() {
		System.out.println("Enter Mobile Number: ");
		String number = sc.next();
		boolean b = Pattern.matches("([9][1]){1}([7-9]{1})([0-9]{9})$", number);
		String result = (b) ? "valid" : "invalid" ;
		return result;
	}
	public String validatePassword() {
		System.out.println("Enter password: ");
		String pwd = sc.next();
		boolean b = Pattern.matches("^(?=.*[A-Z])[A-Za-z]{8,}$", pwd);
		String result = (b) ? "valid" : "invalid" ;
		return result;
	}
	public static void main(String[] args) {
//		System.out.println("Welcome Master");
		RegexPattern reg = new RegexPattern();
		System.out.println("FirstName is : " + reg.validateFirstName());
		System.out.println("Lastname is : " + reg.validateLastName());
		System.out.println("Email is : " + reg.validateEmail());
		System.out.println("Mobile Number is : " + reg.validateMobileNo());
		System.out.println("Password is : " + reg.validatePassword());
	}

}
