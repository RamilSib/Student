package Lesson4;

public class Student {
    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economyAverageGrade;
    double foreignLanguageAverageGrade;

    static class StudentTest {
        public static void main(String[] args) {

            Student st1 = new Student();
            st1.studentId = 1;
            st1.name = "Vladimir";
            st1.surname = "Ivanov";
            st1.course = 2;
            st1.mathAverageGrade = 6.5;
            st1.economyAverageGrade = 8.9;
            st1.foreignLanguageAverageGrade = 9.2;

            Student st2 = new Student();
            st2.studentId = 2;
            st2.name = "Lena";
            st2.surname = "Yagodkina";
            st2.course = 3;
            st2.mathAverageGrade = 9.5;
            st2.economyAverageGrade = 7.8;
            st2.foreignLanguageAverageGrade = 8.8;

            Student st3 = new Student();
            st3.studentId = 3;
            st3.name = "Vasya";
            st3.surname = "Street";
            st3.course = 4;
            st3.mathAverageGrade = 2.2;
            st3.economyAverageGrade = 3.3;
            st3.foreignLanguageAverageGrade = 2.6;

            System.out.println("Arithmetic mean student grade " + st1.name + " " + st1.surname + " = "
                    + (st1.mathAverageGrade + st1.economyAverageGrade + st1.foreignLanguageAverageGrade) / 3);

            System.out.println("Arithmetic mean student grade " + st2.name + " " + st2.surname + " = "
                    + (st2.mathAverageGrade + st2.economyAverageGrade + st2.foreignLanguageAverageGrade) / 3);

            System.out.println("Arithmetic mean student grade " + st3.name + " " + st3.surname + " = "
                    + (st3.mathAverageGrade + st3.economyAverageGrade + st3.foreignLanguageAverageGrade) / 3);



        }

    }


}
