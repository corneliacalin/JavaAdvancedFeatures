package oop.exercises.classesAndInterfaces.task1;
//Task 1
//Create the UserValidator class which with the validateEmails method will be
//responsible for validating user data such as: email, alternative email. Within the
//scope of the validateEmails method, please create the local Email class
//which will be responsible for formatting the provided email. Validation should
//cover the following scenarios:
//if the given email address is empty or it is null, set the value to unknown
//if the given email address does not meet the email criteria, set the value to
//unknown (use regular expressions)

public class Main {
    public static void main(String[] args) {
 UserValidator userValidator=new UserValidator();
 String []result =userValidator.validateEmails("pb@yahoo.com","yahoo.com");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
