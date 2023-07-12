class Student{
    String name;
    static String school;
}

public class jvm {
    public static void main(String args[]){
        Student.school = "JVM";
        Student studen1 = new Student();
        studen1.name = "tony";
        System.out.println(studen1.school);
    }
    
}
