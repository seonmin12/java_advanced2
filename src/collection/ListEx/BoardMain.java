package collection.ListEx;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {

    public static void main(String[] args) {
        //글을 보관, 운영하는 ArrayList 생성
        List<Board> boardList = new ArrayList<Board>();

        //객체(Board) 추가
        boardList.add(new Board("wkrrk1", "sss1", "주제1"));
        boardList.add(new Board("wkrrk2", "sss2", "주제2"));
        boardList.add(new Board("wkrrk3", "sss3", "주제3"));

        //저장된 글 목록 수
        int size = boardList.size();
        System.out.println("총 글의 수:" + size);

        //특정 인덱스의 객체 가져오기
        Board board = boardList.get(1);
//        System.out.printf("주제: %s 내용: %s 작성자: %s",board.getSubject(), board.getContent(),board.getWriter());

        //글목록
//        for(Board board1 : boardList){
//            System.out.printf("주제: %s 내용: %s 작성자: %s%n",board.getSubject(), board.getContent(),board.getWriter());
//        }

        //글삭제
        boardList.remove(1);
        for(int b=0;b<boardList.size();b++){
            System.out.printf("%d", b);
        }
        System.out.println("==================================================");
        boardList.remove(1);
        for(int b=0;b<boardList.size();b++){
            System.out.printf("%d", b);
        }

    }
}
