public class Person {

    private String firstName, lastName;
    private int age;

    public boolean isTeen() {
        return age > 12 && age < 20;
    }
    public String getFullName() {
        boolean isFirstNameEmpty = firstName==null || firstName.isEmpty();
        boolean isLastNameEmpty = lastName==null || lastName.isEmpty();
        String checkedFirstName = isFirstNameEmpty ? "" : firstName;
        String checkedLastName = isLastNameEmpty ? "" : lastName;
        return (checkedFirstName + " " + checkedLastName).trim();
    }

    // Constructors.

    public Person(){}
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
        this.age = age;
    }
    // Getters.
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        if(age<0 || age>100) {
            return 0;
        }

        return age;
    }

    // Setters.
    public void setFirstName (String firstName) {
        this.firstName = firstName.trim();
    }
    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }
    public void setAge(int age) {
        if(age<0 || age>100){
            this.age = 0;
            return;
        }
        this.age = age;
    }
}
