package api.objectEX;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("신세종");
        Member member2 = new Member("신세종");

//        //컴퓨터적인 관점
//        System.out.println(member1 == member2); //주소 비교 false(비교 대상이 객체일 경우)
//
//        //사용자 관점(같은 사람, 같은 데이터), 필드 값을 기준으로 동등 비교하기 위해 equals()를 오버라이딩 함
//        System.out.println(member1.equals(member2));// 객체의 주소값 비교, 오버라이딩 하지 않았음 순수 Object equals() false
//
//        //객체 인스턴스마다 각기 다른 해시코드(주소)값을 가지기 때문이다.
        //현재, Member 클래스에서 equals와 hashcode()를 오버라이딩 했기 때문에, 두 객체 필드 name의 해시코드를 반환, 그래서 같은 값->true
        System.out.println(member1.hashCode());
        System.out.println(member2.hashCode());

        //순수 객체 hashcode 값을 얻고 싶을 때는
        System.out.println(System.identityHashCode(member1));
        System.out.println(System.identityHashCode(member2));

        //리스트를 생성하고 두 객체 데이터 추가
        List<Member> members = new ArrayList<Member>(); //확정성이 있음, 구현체에 대한 접근이 가려짐, 권장
//        ArrayList<Member> members1 = new ArrayList<>(); //구현 객체에 접근하기 쉬움
        members.add(member1);
        members.add(member2);
        System.out.println("현재 m클라우드 짐은" + members.size() + "명의 회원이 존재합니다.");

// 사용자 관점에서 1명으로 보게 됨. equals랑 hashcode 검증해서
        Set<Member> members1 = new HashSet<>();
        members1.add(member1);
        members1.add(member2);
        System.out.println(members1.size());
        // Collection(HashMap, HashSet, HashTable)은 객체가 논리적으로 같은지를 비교할 때 hashcode()->equals()



    }
}
