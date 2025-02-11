package collection.ListEx;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Board {
    private String subject;
    private String writer;
    private String content;

    public Board(String writer, String content, String subject) {
        this.writer = writer;
        this.content = content;
        this.subject = subject;
    }
}
