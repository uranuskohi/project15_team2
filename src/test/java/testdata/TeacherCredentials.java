package testdata;

public class TeacherCredentials {

    public static void main(String[] args) {
        System.out.println(TeacherCredentials.getInstance().getNameForAssertion());
    }
    private static TeacherCredentials instance;

    private String nameForAssertion = "Fred";
    private String surnameForAssertion;
    private String phoneForAssertion;
    private String ssnForAssertion;
    private String usernameForAssertion;

    private TeacherCredentials(){
    }
    public static synchronized TeacherCredentials getInstance() {
        if (instance == null) {
            instance = new TeacherCredentials();
        }
        return instance;
    }

    public String getNameForAssertion() {
        return nameForAssertion;
    }

    public void setNameForAssertion(String nameForAssertion) {
        this.nameForAssertion = nameForAssertion;
    }

    public String getLastNameForAssertion() {
        return surnameForAssertion;
    }

    public void setLastNameForAssertion(String lastNameForAssertion) {
        this.surnameForAssertion = lastNameForAssertion;
    }

    public String getPhoneForAssertion() {
        return phoneForAssertion;
    }

    public void setPhoneForAssertion(String phoneForAssertion) {
        this.phoneForAssertion = phoneForAssertion;
    }

    public String getSsnForAssertion() {
        return ssnForAssertion;
    }

    public void setSsnForAssertion(String ssnForAssertion) {
        this.ssnForAssertion = ssnForAssertion;
    }

    public String getUsernameForAssertion() {
        return usernameForAssertion;
    }

    public void setUsernameForAssertion(String usernameForAssertion) {
        this.usernameForAssertion = usernameForAssertion;
    }
}
