package src.people;

public class Person {
    
    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String newName){
        this.firstName = newName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person io = new Person();
        io.setFirstname("John");
        System.out.println(io.getFirstName());
    }

}