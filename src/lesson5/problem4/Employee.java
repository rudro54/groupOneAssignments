package lesson5.problem4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    abstract double getPayment();

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format(
                "First Name: %s \nLast Name: %s \nSocial Security Number: %s \nPayment: %.2f\n",
                getFirstName(),
                getLastName(),
                getSocialSecurityNumber(),
                getPayment()
        );
    }
}
