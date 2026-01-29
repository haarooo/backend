package 종합예제.종합예제6.Model.dto;

public class BoardDto {

    //1. 멤버변수
    private int no;
    private String content;
    private String writer;
    //2. 생성자 : 관례적으로 기본생성자 + 전체생성자


    public BoardDto() {

    }

    public BoardDto(int no, String content, String writer) {
        this.no = no;
        this.content = content;
        this.writer = writer;
    }



    //3. 메소드 : private 멤버변수에 대해 setter/getter 제공

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "no=" + no +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
