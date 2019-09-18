# 인스타그램 clone 프로젝트

> 해당 저장소는 TDD 기반의 인스타그램 clone을 목표로 진행되는 프로젝트의 예제를 저장소 입니다. 

## 필수사항
- [X] IntelliJ IDEA Ultimate ( >= 2019.02)
- [X] openJDK ( >= 11)
- [X] MySQL ( == 5.7.x)
    - [X] Workbench

## 9월 18일 - Spring 기반 테스트 코드 작성

### 프로젝트 생성
- [X] Web
- [X] JPA
- [X] HATEOAS
- [X] REST Docs
- [X] MySQL
    - 실행 용도로 사용
    - main > resources > application.properties 설정 필요
- [X] H2
    - 테스트 용도로 사용 
    - test > resources > application.properties 설정 필요    
- [X] Lombok
    - 플러그인 설정
    - Settings > Build, Execution, Deployment > Compiler > Annotation Processors > Enable

### 프로젝트 실행 설정

- [X] MySQL에 데이터베이스(혹은 스키마) 생성
- [X] IDEA 실행 후 Lombok 설정
- [X] main > resources > application.properties 파일에 MySQL 설정
- [X] Application.java 실행 확인

### JavaBean 테스트

- [X] Builder 테스트
- [ ] 기본 생성자
- [ ] Setter/Getter
- [ ] id
- [ ] 모든 필드값을 입력받는 생성자
 