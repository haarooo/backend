package 도서관리.model.BookDto;

public class UserDto {
    private String id;
    private int pwd;
    private String phone;;
    private int userNo;


    public UserDto() {}

    public UserDto(int userNO , String id, int pwd, String phone) {
        this.id = id;
        this.pwd = pwd;
        this.phone = phone;
        this.userNo = userNO;
    }


    public String getId() {
        return id;
    }

    public int getPwd() {
        return pwd;
    }

    public String getPhone() {
        return phone;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(int pwd) {
        this.pwd = pwd;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", pwd=" + pwd +
                ", phone='" + phone + '\'' +
                '}';
    }
}


