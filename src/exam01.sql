create database mydb0203; -- db생성
use mydb0203; -- db 활성화

-- 테이블 생성
-- create table 테이블명(속성명 타입 제약조건 , 속성명 타입 제약조건);
create table test1( 속성명 int);

-- 테이블 목록 보기
show tables;

create table test2(속성명1 int , 속성명2 double);

-- 테이블 삭제 drop tabe/database if exists 
drop table if exists test1;

-- 테이블 간단 조회 , select 속성명1 , 속성명2 from 테이블명; select * from 테이블명;
select * from test2;
-- 다양한 데이터 타입의 테이블 생성
create table test3(
	정수속성1 tinyint , 정수속성2 smallint , 정수속성3 mediumint ,
    정수속성4 int , 정수속성5 bigint , 정수속성6 int unsigned , -- signed = (+-)부오힝ㅆ는 , unsigned = 부호없음
    실수속성1 float , 실수속성2 double , 실수속성 decimal, 
    날자속성 date , 시간속성 time , 날짜시간속성 datetime, 
    문자속성1 char(5), 
    문자속성2 varchar(5), -- 가변길이 문자타입 , varchar(5) -> 유재석 ->[유][재][석] xx남은 2칸 삭제
    문자속성3 text, 문자속성4 longtext, -- 4gb 대용량
    논리속성 bool -- true 또는 false , tinyint취급 , 1 또는 0
);
select * from test3;

-- 방문 기록하는 테이블설계
create table commetn(
	content varchar(255), -- 내용물 최대 255글자
    writer varchar(20) -- 작성자 최대 20글자
);
select * from commet;

-- 대기명단 기록하는 테이블설계
create table waiting(
	count tinyint unsigned ,-- 인원수 최대 0~255까지 , 
    phone char(13) -- 연락처 최대 13글자까지 고정
);
select * from waiting ;

-- 제약조건 : 테이블내 문제와 결함이 되는 입력 방지/해결
create table test4(
	# 속성명 타입 제약조건명
    속명명1 tinyint not null, -- not null이란? 해당 속성값들은 null 저장할 수 없다
    속성명2 smallint unique , -- 해당 속성값들은 중복 불가능
    속성명3 int default 10 , -- default 자료 : 만일 해당 속성에 초기값이 생략되면 기본값 자료 사용
    속성명4 bigint auto_increment,  -- auto_increment : 만일 해당 속성에 초기값이 생략되면 자동번호 부여한다
    constraint primary key(속성명4) -- primary key : pk(식별키/기본키), 식별가능한 고유한 값을 가진 키
								-- 중복없음(unique) + 빈칸없음(not null)이 기본
                                -- constraint primary key (속성명);
);

create table test5(
	속성명1 bigint , 
    constraint foreign key(속성명1) references test4(속성명4) on delete set null  
    -- constraint foreign key(FK속성명) references 테이블명(PK 필드명)
    -- on update restrict : fk와 pk 참조 관계일때 pk삭제/수정 가능
    -- on update delete cascade : pk가 삭제 또는 수저 ㅇ될때 fk도 같이 삭제 
					--  set null : pk가 삭제/수정 될때 fk는 null 변경 관계 : 게시물이 삭제되면 댓글 참조는 null
);
select * from test4;

select * from test5;



