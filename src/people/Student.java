package src.people;

class Student {
    int id;
    String name;
    String gender;

    public boolean nameUpdate(String newName) {
        name = newName;
        return true;
    }

    public static void main(String[] args) {
        Student x = new Student();

        x.id = 1000;
        x.name = "joan";
        x.gender = "male";

        x.nameUpdate("John");

        System.out.println(x.id);
        System.out.println(x.name);
        System.out.println(x.gender);
    }
}