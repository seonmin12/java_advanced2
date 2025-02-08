package InnerClass.ex06.builderStudent;

import lombok.Getter;
import lombok.Setter;

public class Student {
    //필수멤버
    private String id;
    private String name;
    private String major;
    //선택멤버
    private String grade;
    private String phoneNumber;
    private String address;



    private Student(StudentBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.major = builder.major;
        this.grade = builder.grade;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
    }



    public static class StudentBuilder {
        @Setter
        @Getter

        private String id;
        private String name;
        private String major;

        private String grade = "freshman";
        private String phoneNumber;
        private String address;

        public StudentBuilder(String id, String name, String major) {
            this.id = id;
            this.name = name;
            this.major = major;

        }

        public StudentBuilder addGrade(String grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder addPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public StudentBuilder addAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    } // inner 클래스 끝

        @Override
        public String toString() {
            return "Student info{"+
                    "id: " + id +
                    ", name: " + name +
                    ", major: " + major +
                    ", grade: " + grade +
                    ", phoneNumber: " + phoneNumber +
                    ", address: " + address +
                    '}';

        }

}
