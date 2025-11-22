package JavaRegex;

public class UserRegistration {
	// UC1: First Name
    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }
    
 // UC2: Last Name
    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return lastName.matches(regex);
    }
    
 // UC3: Email
    public boolean validateEmail(String email) {
        String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-z]{2,}(\\.[a-z]{2})?$";
        return email.matches(regex);
    }
    
 // UC4: Mobile Number
    public boolean validateMobile(String mobile) {
        String regex = "^[0-9]{2} [0-9]{10}$";
        return mobile.matches(regex);
    }
    
 // UC5: Password Rule 1 – Min 8 chars
    public boolean validatePasswordRule1(String password) {
        String regex = "^.{8,}$";
        return password.matches(regex);
    }
    
 // UC6: Password Rule 2 – At least 1 Uppercase
    public boolean validatePasswordRule2(String password) {
        String regex = "^(?=.*[A-Z]).{8,}$";
        return password.matches(regex);
    }
    
 // UC7: Password Rule 3 – At least 1 Numeric
    public boolean validatePasswordRule3(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        return password.matches(regex);
    }
    
 // UC8: Password Rule 4 – Exactly 1 Special Character
    public boolean validatePasswordRule4(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=[^!@#$%^&*]*[!@#$%^&*][^!@#$%^&*]*$).{8,}$";
        return password.matches(regex); 
    }
    
 // UC9: Multiple Emails
    public void testMultipleEmails(String[] emails) {
        for(String email : emails) {
            System.out.println(email + " : " + validateEmail(email));
        }
    }
    
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        
        System.out.println("First Name Valid: " + user.validateFirstName("John"));
        System.out.println("Last Name Valid: " + user.validateLastName("Doe"));
        System.out.println("Email Valid: " + user.validateEmail("abc.xyz@bl.co.in"));
        System.out.println("Mobile Valid: " + user.validateMobile("91 9919819801"));
        System.out.println("Password Rule1 Valid: " + user.validatePasswordRule1("Pass@123"));
        System.out.println("Password Rule2 Valid: " + user.validatePasswordRule2("Pass@123"));
        System.out.println("Password Rule3 Valid: " + user.validatePasswordRule3("Pass@123"));
        System.out.println("Password Rule4 Valid: " + user.validatePasswordRule4("Pass@123"));
    }
}


