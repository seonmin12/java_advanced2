package genericEx.Practice;
//3. Comparable<T> 를 확장하는 타입의 두 객체를 비교하는
//제너릭 메소드 compareTo를 작성하세요. 이 메서드를 이용하여 두 숫자를 비교하세요.
public class BoundedGenericMethod {

    public static <T extends Comparable<T>> T max(T t1, T t2){
        return t1.compareTo(t2)>0 ? t1 : t2;

    }

    public static void main(String[] args) {
        System.out.println(BoundedGenericMethod.max(20,30));
    }
}
