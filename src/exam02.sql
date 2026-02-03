-- 회원제 게시판
drop database if exists boardservice6; -- 존재할 수 있으므로 데이터베이스 삭제
create database boardservice6;
use boardservice6;

create table member(
	mno int auto_increment, -- 회원번호 이면서 자동번호 부여
    mid varchar(30) not null unique , -- 회원의 아이디 , 문자타입30글지 , 빈칸 불가능 , 중복 불가능
    mpw varchar(30) not null , -- 회원 비밀번호
    mname varchar(10), -- 회원 닉네임
    mphone char(13) , -- 회원연락처check
    constraint primary key (mno) -- 회원번호를 PK로 설정
    
);
select * from member;

create table product(
	pno int auto_increment , -- 제품번호
    pname varchar(100) not null unique,
    pprince int unsigned default 0 , -- 가격이므로 음수는 필요없다 unsigned
    pcomment longtext , -- 최대 4gb까지 가능한 문자타입 
    pdate datetime default now() ,  -- 날짜랑 시간 기본값을 현재시스템 날짜/시간 자동 부여 
    mno int , -- fk로 사용할 필드명의 타입은 PK 필드명과 일치
    constraint foreign key (mno) references member(mno) on delete cascade ,
    constraint primary key(pno) 
    
);
select * from product
-- ER 다이어그램 : 여러 테이블들 간의 관계를 시각적, ERD 다이어그램
-- 워크벤치 메뉴 상단 -> [Database] -> [Reverse enjineer]