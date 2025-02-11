package genericEx.lamdaExGeneric;
// Transformer 제너리기 함수형 인터페이스 정의
@FunctionalInterface
public interface Transformer<T, R> {
    R transform(T input);
}
