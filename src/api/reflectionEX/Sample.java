package api.reflectionEX;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        String str = new String("Class클래스 테스트");
        Class<? extends String>cls = str.getClass(); //자신의 정보 가져옴
        System.out.println(cls);

        //.class 리터럴로 얻기
        Class<? extends String>cls2 = String.class;
        System.out.println(cls2);

        //Class.forName() , 인스턴스 할 수 없음
        try{
            Class<?>cls3 = Class.forName("java.lang.String"); //동적로딩: 이름으로 직접 부름, forName()은 반드시 예외처리
            System.out.println(cls3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("1. " + cls.getSimpleName());
        System.out.println("2. " + cls.getPackage());
        System.out.println("3. " + cls.getName());
        System.out.println("4. " + cls.toString());
        System.out.println("5. " + cls.toGenericString());

        System.out.println("6. " + Arrays.toString(cls.getFields()));
        System.out.println("7. " + Arrays.toString(cls.getMethods()));
        System.out.println("8. " + Arrays.toString(cls.getInterfaces()));
        System.out.println("9. " +cls.getSuperclass());

    }
}
