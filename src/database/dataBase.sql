# 한줄주석
-- 한줄주석(--뒤에 띄어쓰기)
/* 여러줄 주석 */
-- ㅁㅁ -- (ctrl + /) 
-- 1. 명령어 작성하는 방법 
-- 2. 명령어 실행 
-- 방법 : 실행할 명령어가 위치한 줄에서 ctrl+enter
-- 방법 : 상단에 번개모양 클릭 					
-- 3. 명려어 결과 확인 : 실행 후 하단에 result grid 또는 output에서 확인
-- 4. 명렁여 작성한.spl파일 저장 
-- ctrl + s 자바프로젝트와 같은 폴더에 저장하여 git에 저장
-- 번개모양 왼쪽에 저장아이콘 클릭
-- 5. 새로운 파일 생성 : 상단에 SQL(+)아이콘 클릭 
show databases;

-- 데이터베이스 생성과 삭제

-- 1. 현재 DB서버에서의 모든 데이터베이스 목록 확인
show databases;
-- 2. 
show variables like 'datadir';

create
database
mydb0130; -- 데이터베이스 이름
-- 4. 삭제 drop
drop 
database 
mydb0130;

-- if
drop database if exists mydb0130;
-- 5. 데이터베이스 황성화(현재 DB서버네 여려개 데이터베이스가 존재하므로 사용할 DB를 선택)
use mydb0130;
	-- 사용한다 -- 사용할 데이터베이스명
    
    
    






