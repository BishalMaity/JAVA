class Student{

        Student(){
           System.out.println("It is Constructor"); 
        }

        void study(){
            System.out.println("It is Method");
        }
}

public class Constructor{

    public static void main(String[] args) {
        
        Student s = new Student();

    }
}

//If Student class is written inside the Constructor class then i have to write static class student

// public class Constructor {

//     static class Student {

//         Student() {
//             System.out.println("It is Constructor");
//         }

//         void study() {
//             System.out.println("It is Method");
//         }
//     }

//     public static void main(String[] args) {

//         Student s = new Student();

//         s.study();
//     }
// }