package genericEx.ex04;

public class Course {

    //Person(사람)이면 수강등록 기능
    public static void registerCourse1(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 course1을 등록함");

    }


    //학생만 등록 가능
    public static void registerCourse2(Applicant<? extends Student> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 course2을 등록함");
    }


    //직장인 및 일반인만 등록 가능
    public static void registerCourse3(Applicant<? super Worker>applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이 course3을 등록함");
    }
}
