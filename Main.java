import java.util.Arrays;
//into the world of objects craeting passport, Add the getter getPassport().
// Your code contains a setter setPassport.Call the setter if the person gets approved for a passport.
//Test Case: Passport Denied/approved
public class Main {

    public static void main(String[] args) {


        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);

        if (person.applyPassport() == true) {
            person.setPassport();
        }

        System.out.println("Name: " + person.getName() + "\n"
                +  "Nationality: " + person.getNationality() + "\n"
                +  "Date of Birth: " + person.getDateOfBirth() + "\n"
                +  "Seat Number: " + person.getSeatNumber() + "\n"
                +  "Passport: " + Arrays.toString(person.getPassport()) + "\n");
    }

}