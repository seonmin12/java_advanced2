package InnerClass.ex06.builderStudent;

public class StudentMain {
    public static void main(String[] args) {
       Student stu1 = new Student.StudentBuilder("20201034","김선민", "지리학과").addAddress("서울시 강남구").addGrade("4학년").build();
       Student stu2 = new Student.StudentBuilder("2019686", "홍길동","컴퓨터공학과").addAddress("서울시 동대문구").addPhoneNumber("0103945334").build();
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
