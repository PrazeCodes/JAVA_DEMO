class Student {
    String name ; 
    int age;

    public void printName () {
        System.out.println(this.name); // this keyword is used to tell the function which object is calling this function
    }

    public void printAge () {
        System.out.println(this.age); // this keyword is used to tell the function which object is calling this function
    }

    // non-parametarised construtor
    Student() {
        System.out.println("non-parametarised constructor called");
    }

    //parametarised constructor
    Student(String name , int age) {
        System.out.println("parametarised constructor called");
        this.name = name;//this.name is the name of the object and the name is the parameter. parameter is assigned to the object 
        this.age = age;
    }
} 
public class OOPS {
    public static void main(String args[]) {
        Student student1 = new Student("Pranjal", 22);
        Student student2 = new Student();
        student2.name = "Soumili";
        student2.age = 22;

        student1.printName ();
        student2.printName();
    }
}
