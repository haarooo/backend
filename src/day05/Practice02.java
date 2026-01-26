package day05;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

/*[문제 1] Book 클래스를 만드세요. 이 클래스는 title(문자열), author(문자열), price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Book 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "이것이 자바다", "신용권", 30000을, 두 번째 객체에는 "자바의 정석", "남궁성", 28000을 각각 저장하세요.
3. 두 객체의 모든 정보를 각각 출력하세요.*/
        Book book1 = new Book();
        book1.title = "이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000 ;

        Book book2 = new Book();
        book2.title = "자바의 정석";
        book2.author = "남궁성";
        book2.price = 28000;

        Book[] 책장 = {book1 , book2};
        System.out.println( "book1 : " + book1.title + book1.author + book1.price );
        System.out.println("book2 : " + book2.title + book2.author + book2.price);




/*[문제 2] Pet 클래스를 만드세요. name(문자열), species(문자열, 품종), age(정수) 멤버 변수를 가집니다.
1. main 함수에서 Pet 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "초코", "푸들", 3을, 두 번째 객체에는 "나비", "코리안숏헤어", 5를 각각 저장하세요.
3. "이름: [이름], 종류: [품종], 나이: [나이]살" 형식으로 각 반려동물의 프로필을 출력하세요.*/

        Pet pet1 = new Pet();
        pet1.name = "초코";
        pet1.species = "푸들";
        pet1.age = 3;

        Pet pet2 = new Pet();
        pet2.name = "나비";
        pet2.species = "코리안숏헤어";
        pet2.age = 5;
        System.out.printf("이름 : %s , 종류 : %s , 나이 : %d \n" , pet1.name , pet1.species , pet1.age);
        System.out.printf("이름 : %s , 종류 : %s , 나이 : %d \n" , pet2.name , pet2.species , pet2.age);




/*[문제 3] Rectangle 클래스를 만드세요. width(정수)와 height(정수) 멤버 변수를 가집니다.
1. main 함수에서 Rectangle 객체를 하나 생성하고, width에 10, height에 5를 저장하세요.
2. 해당 객체의 width와 height 값을 곱하여 "사각형의 넓이: [넓이]"를 출력하세요.*/
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 10;
        rectangle1.height = 5;
        System.out.println("사각형의 넓이 : " + rectangle1.width * rectangle1.height);



/*[문제 4] BankAccount 클래스를 만드세요. accountNumber(문자열), ownerName(문자열), balance(정수, 잔액) 멤버
변수를 가집니다.
1. main 함수에서 BankAccount 객체를 하나 생성하고, 계좌번호는 "111-222-3333", 예금주는 "유재석", 초기 잔액은 10000
으로 저장하세요.
2. balance에 5000을 더하여 입금 상황을 구현하고, "입금 후 잔액: [잔액]"을 출력하세요.
3. 다시 balance에서 3000을 빼서 출금 상황을 구현하고, "출금 후 잔액: [잔액]"을 출력하세요.*/
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = "111-222-3333";
        bankAccount1.ownerName = "유재석";
        bankAccount1.balance = 10000;
        System.out.println("입금5000\n" + "입금 후 잔액 : "+(bankAccount1.balance+5000));
        System.out.println("출금3000\n" + "출금 후 잔액 : "+(bankAccount1.balance+5000-3000));



/*[문제 5] Product 클래스를 만드세요. name(문자열)과 price(정수) 멤버 변수를 가집니다.
1. main 함수에서 Product 객체 2개를 생성하고, 각각 "새우깡", 1500과 "콜라", 2000 정보를 저장하세요.
2. if문을 사용하여 두 객체의 price를 비교하고, 더 비싼 상품의 이름을 출력하세요.*/
        Product product1 = new Product();
        product1.name = "새우깡";
        product1.price = 1500;

        Product product2 = new Product();
        product2.name = "콜라";
        product2.price = 2000;

        if(product1.price > product2.price){
            System.out.println(product1.name);
        }else{
            System.out.println(product2.name);}



/*[문제 6] Member 클래스를 만드세요. id(문자열)와 isLogin(boolean) 멤버 변수를 가집니다.

1. main 함수에서 Member 객체를 하나 생성하고, 아이디는 "admin", isLogin은 false로 초기화하세요.
2. "로그인 전 상태: [isLogin 값]"을 출력하세요.
3. 객체의 isLogin 값을 true로 변경하여 로그인 상황을 구현하세요.
4. "로그인 후 상태: [isLogin 값]"을 출력하세요.*/
        Member member1 = new Member();
        member1.id = "admin";
        member1.isLogin = false;
        member1.isLogin = true;
        System.out.println("로그인 후 상태 : " + member1.isLogin);


/*[문제 7] Television 클래스를 만드세요. channel(정수)과 volume(정수) 멤버 변수를 가집니다.

1. main 함수에서 Television 객체를 생성하고, channel은 7, volume은 20으로 초기화하세요.
2. 객체의 channel 값을 11로 변경하고, volume 값은 2 감소시킨 뒤, 변경된 채널과 볼륨을 출력하세요.*/

        Television television1 = new Television();
        television1.channel = 7;
        television1.volume = 20;

        television1.channel = 11;
        television1.volume = television1.volume-2;
        System.out.printf("%d %d \n" , television1.channel , television1.volume);


/*[문제 8] Player 클래스를 만드세요. name(문자열), power(정수), speed(정수) 멤버 변수를 가집니다.

1. main 함수에서 Player 객체 2개를 생성하세요.
2. 첫 번째 객체에는 "손흥민", 90, 95를, 두 번째 객체에는 "이강인", 85, 92를 각각 저장하세요.
3. 두 객체의 power와 speed의 합을 각각 계산하고, 합이 더 높은 선수의 이름을 출력하세요.*/

        Player player1 = new Player();
        player1.name = "손흥민";
        player1.power = 90;
        player1.speed = 95;
        Player player2 = new Player();
        player2.name = "이강인";
        player2.power = 85;
        player2.speed = 92;

        int sum1 = player1.power + player1.speed;
        int sum2 = player2.power + player2.speed;
        if(sum1 > sum2){
            System.out.println(player1.name);
        }else{
            System.out.println(player2.name);
        }



/*[문제 9] MenuItem 클래스를 만드세요. name(문자열), price(정수), isSignature(boolean, 대표메뉴 여부) 멤버 변수를 가집
니다.

1. main 함수에서 MenuItem 객체 3개를 생성하고, 첫 번째는 "김치찌개", 8000, true, 두 번째는 "된장찌개", 8000, false, 세 번
째는 "계란찜", 3000, false로 저장하세요.
2. if문을 사용하여 isSignature가 true인 메뉴 객체를 찾아, "[대표메뉴] [메뉴이름] : [가격]원" 형식으로 출력하세요.*/
        MenuItem menuItem1 = new MenuItem();
        menuItem1.name = "김치찌개";
        menuItem1.price = 8000;
        menuItem1.isSignature = true;
        MenuItem menuItem2 = new MenuItem();
        menuItem2.name = "된장찌개";
        menuItem2.price = 8000;
        menuItem2.isSignature = false;


        MenuItem[] menuItems = {menuItem1 , menuItem2};
        for(int index = 0 ; index <= menuItems.length-1 ; index++){
            if(menuItems[index].isSignature == true){
                System.out.println("대표메뉴" + menuItems[index].name + ":"+menuItems[index].price+"원");
            }
        }






/*[문제 10] UserProfile 클래스를 만드세요. name(문자열), age(정수), mbti(문자열) 멤버 변수를 가집니다.

1. main 함수에서 UserProfile 객체를 하나 생성하세요.
2. Scanner를 사용하여 사용자로부터 이름, 나이, MBTI를 순서대로 입력받으세요.
3. 입력받은 값들을 생성된 객체의 각 멤버 변수에 저장하세요.
3. 모든 정보가 저장된 객체의 멤버 변수들을 가져와 "--- 프로필 ---", "이름: [이름]", "나이: [나이]", "MBTI: [MBTI]" 형식으
로 출력하세요.*/

        UserProfile userProfile1 = new UserProfile();
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 : "); String name1 = scan.nextLine();
        System.out.print("나이 : "); int age1 = scan.nextInt();
        scan.nextLine();
        System.out.print("mbti : "); String mbti1 = scan.nextLine();

        userProfile1.name = name1;
        userProfile1.age = age1;
        userProfile1.mbti = mbti1;
        System.out.println("---프로필---");
        System.out.println("이름 : "+userProfile1.name+" \n나이 : "+userProfile1.age+"\n MBTI :"+userProfile1.mbti);










    }

    public static class Book {
        //title(문자열), author(문자열), price(정수) 멤버 변수
        String title;
        String author;
        int price;

        /*
        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
         */
    }
}

