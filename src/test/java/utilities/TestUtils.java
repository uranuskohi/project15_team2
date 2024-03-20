package utilities;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;

public class TestUtils {

    public static String birthPlaceGenerator(){
        Faker faker = new Faker();
        String fakerBirthPlace;
        do {
            fakerBirthPlace = faker.address().city();
        } while (fakerBirthPlace.length() <= 3);
        return fakerBirthPlace;
    }

    public static String phoneNumberGenerator(){
        Faker faker = new Faker();
        String phoneNumber = faker.numerify("##########");
        String fakerPhoneNumber = phoneNumber.substring(0,3)+"-"+phoneNumber.substring(3,6)+"-"+phoneNumber.substring(6,10);
        return fakerPhoneNumber;
    }

    public static String dateOfBirthGenerator(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Faker faker = new Faker();
        String fakerDateOfBirth = simpleDateFormat.format(faker.date().birthday());
        return fakerDateOfBirth;
    }

    public static String ssnGenerator(){
        Faker faker = new Faker();
        String ssn = faker.numerify("#########");
        String fakerSsn;
        do {
            fakerSsn = ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,9);
        } while (fakerSsn.startsWith("9"));
        return fakerSsn;
    }

    public static String ssn8DigitGenerator(){
        Faker faker = new Faker();
        String ssn = faker.numerify("########");
        String fakerSsn;
        do {
            fakerSsn = ssn.substring(0,3)+"-"+ssn.substring(3,5)+"-"+ssn.substring(5,8);
        } while (fakerSsn.startsWith("9"));
        return fakerSsn;
    }

    public static String usernameGenerator() {
        Faker faker = new Faker();
        String fakerUsername;
        do {
            fakerUsername = faker.lorem().word()+faker.lorem().word();
        } while (fakerUsername.length()<=4);
        return fakerUsername;
    }

    public static String passwordGenerator() {
        Faker faker = new Faker();
        String fakerPassword;
        do {
            fakerPassword = faker.internet().password(8, 12, true, false)+faker.numerify("#");
        } while (!containsLowercase(fakerPassword));
        return fakerPassword;
    }

    private static boolean containsLowercase(String fakerPassword) {
        for (char c : fakerPassword.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

}
