package codewars.level7.strings;

public class Dinglemouse {

    private String firstName;
    private String lastName;

    public Dinglemouse(String firstName, String lastName) {
        this.firstName = firstName.trim();
        this.lastName = lastName.trim();
    }

    public String getFullName() {
        return (firstName + " " + lastName).trim();
    }

    public static void main(String[] args) {
        System.out.println(new Dinglemouse("Clint", "Eastwood").getFullName());
    }

}
