package src.people;

class Student {
    int id;
    String name;
    String gender;
    private static int counter;

    public static Student addStudent(String name, String gender) {
        Student s=new Student();
        counter++; //unique counter
        s.id=counter;
        s.name=name;
        s.gender=gender;
        return s;
    }

    public static void listStudents(Student[] all) {
        for (Student s : all) {
            System.out.print(s.id+", ");
            System.out.print(s.name+", ");
            System.out.println(s.gender+".");
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=addStudent("John","male");
        students[1]=addStudent("Raj","male");
        students[2]=addStudent("Anita","female");
        listStudents(students);
    }
}