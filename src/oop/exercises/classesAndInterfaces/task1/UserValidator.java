package oop.exercises.classesAndInterfaces.task1;

import java.time.temporal.ValueRange;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public String[] validateEmails(String email, String alternativeEmail) {
        class Email {
            private String email;

            public Email(String email) {
                if (email == null || email.isEmpty()||!validate(email)){
                    this.email = "unknown";
                }
        else{
                    this.email = email;
                }
            }
        }

                Email email1 = new Email(email);
                Email email2 = new Email(alternativeEmail);
                return new String[]{email1.email, email2.email};


}
public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]", Pattern.CASE_INSENSITIVE);
    public static boolean validate(String emailStr){
    Matcher macher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
    return macher.find();
    }
}
