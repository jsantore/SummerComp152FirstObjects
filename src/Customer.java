public class Customer {
    private String firstName;
    private String lastName;
    private String middleName;

    public void setName(String fName,
                        String lName, String mName){
        firstName = fName;
        lastName = lName;
        middleName = mName;
    }

    public String getName(){
        if (middleName == null) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }
}
