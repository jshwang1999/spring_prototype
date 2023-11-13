# progress.txt

This file was created to record my activity and changes in this Spring Project(prototype).

## 0. Index
1. Settings   
   1.1. Develop Environment   
   1.2. External Libraries   
   1.3. Others

2. Records   
   2.1. What I learned   
   2.2. What I did
   2.3. What I solved(errors, etc.)

3. References   
    3.1. Book

***

## 1. Settings
### 1.1. Develop Environment
- Java version: Java 17
- JDK version: JDK 17
- Spring Boot version: 3.1.5

### 1.2. External Libraries
- Spring Boot DevTools
- Spring web
- Thymeleaf
- Lombok
- Spring data JPA
- Mariadb Driver

### 1.3. Others
- MariaDB port number: 3306 
- Apache Tomcat port number: 8080   
  (Above settings can be found in '/src/resources/application.properties')
- Some settings for convenience
  - Edit Configuration... -> ['On Update action', 'On frame deactivation'] -> Update classes and resources

***

## 2. Records
### 2.1. What I learned

***Spring boot는...***
1. 라이브러리만으로 설정을 인식하려는 특성을 갖는다(Auto configuration).
2. lombok(로깅 라이브러리), HikariCP를 기본적으로 사용한다.

*Java Bean이란?*
: 데이터 표현을 목적으로 하는 자바 클래스.
자바 빈(Java Bean) 클래스는 다음과 같은 규약을 지켜야 한다.

- 클래스는 반드시 패키지화 되어야 한다.
- 멤버변수는 property(프로퍼티)라고 부른다.
- property 접근제한자는 'private'.
- 외부접근은 getter/setter로 접근한다.
- property가 boolean이면 get이 아니라 is를 사용해도 된다.


### 2.2. What I did
***
#### 2023.11.13(Mon)
***
page: 402~412.p
1. Created Spring Boot project.('spring_example')
2. 
3.
4.

***
#### 2023.11.14(Tue)
***


### 2.3. What I solved
#### 2.3.1. *Errors*
- git push시 unable to read askpass response from ... 에러   
  --> Settings -> Git -> 'Use Credential Helper' 옵션 On
   
- 'application.properties' 파일 내 한글 문자에 Unsupported characters for the charset 'iso-8859-1' 에러
  --> Settings -> Editor -> File Encodings -> 'Transparent native-to-ascii conversion' 옵션 On

#### 2.3.2 Git
- How to merge master branch to main branch
  1. git checkout master
  2. git branch main master -f
  3. git checkout main
  4. git push origin main -f
  (source: https://velog.io/@lecharl/master-main-강제-병합)

## 3. References
### 3.1. Books
- 자바 웹 개발 워크북
  - 출판사: 프리렉
  - 저자: 구멍가게 코딩단
- 점프 투 스프링부트
  - 출판사: 위키독스(wikidocs)
  - 저자: 박응용
  - url: https://wikidocs.net/book/7601