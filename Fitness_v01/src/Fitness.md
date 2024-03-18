<피트니스 멤버 관리 프로젝트>

회원 아이디 (int):  임의의 숫자 (중복되지 않아야 함, Not Null) : PK(Primary Key)
회원 이름 : String (Not Null)
키 : double 
몸무게 : double
BMI : double 
결과 : String (ex> 저체중/정상/비만)

// BMI 계산, BMI 결과 함수

BMI = 체중/(신장^2)

단축키 : shift+c : empty 생성자

고도 비만 : 35 이상
중도 비만 : 30 - 34.9
경도 비만 : 25 - 29.9
   과체중 : 23 - 24.9
     정상 : 18.5 - 22.9
   저체중 : 18.5 미만


<프로젝트 진행 과정>

  ※ vo 설계 시
    - 멤버 필드는 private
    - 생성자 2개
    - setter,getter
    - toString


v1 - 1명의 데이터 처리
  1) Fitness VO 설계 ==> 값
  2) Service 분리 ==> Business Logic (기능적 요구사항 / 비기능적 요구사항)을 처리
      CRUD(Create, Retrieve, Update, Delete)


v2 - 다수의 데이터 처리 (객체 배열)
  1) Fitness VO 설계 
  2) Service 분리


v3 - 다수의 데이터 처리 (객체 배열)
  1) Fitness VO 설계 
  2) UI 분리 (input, output 분리)
  3) sevice 분리 (service : 객체 배열 처리하는 것만 남김)
  ======================================================

        -> UI를 생성함 -> UI는 service를 생성 및 호출
  main
        <- (re) UI    <- (re)  service

  ======================================================
  1) Service --> 이름 수정 (FitnessUI.java)
  2) Service에 필요한 메소드 설계 (using interface)
    -> classname : FitnessServiceImpl , 인터페이스 생성 : FitnessService

  ※ output함수 : 출력하는 함수 vo안에 있는데, output 대신에 우리가 가진 멤버를 toString을 오버라이딩해서 사용


v4 - 다수의 데이터 처리 (자료구조 처리)
  1) Fitness VO 설계
  2) Service 분리
  3) UI 분리 



v5 - 다수의 데이터 처리 + File IO처리(자료구조 처리)
  1) Fitness V0 설계
  2) service 분리 
  3) UI 분리


v6 - 다수의 데이터 처리 + DB 연동 처리(자료구조 처리)
  1) Fitness V0 설계
  2) service 분리 
  3) UI 분리
  4) DAO분리
