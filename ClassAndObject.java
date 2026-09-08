class Student {
    String name;
    int age;

    void user(){
        System.out.println(name+" is "+age+" years old");
    }
}


public class ClassAndObject{

    public static void main(String[]args){

    Student s1=new Student();
    Student s2=new Student();

    s1.name="Bishal";
    s1.age=22;

    s2.name="Debayan";
    s2.age=21;

    s1.user();
    s2.user();

}
}


