# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 요구사항 정리
1. 주어진 횟수 동안 n 대의 자동차는 전진 또는 멈출수 있다
-> n대의 자동차
2. 각 자동차에 이름을 부여할수 있다.
3. 전진하는 자동차를 출력할때 자동차 이름을 같이 출력한다.
4. 자동차 이름은 , 기준으로 구분하며 이름은 5자 이하만 가능하다
-> 입력값을 ,로 구분
-> 5자 이하만 가능
5. 사용자는 몇번 이동할지 입력해야한다.
-> 이동횟수를 입력받아 해당 횟수만큼 반복
6. 전진조건은 0~9사이 랜덤값
-> 4이상일때 전진
-> 3이하면 멈춤
7. 게임종료시 우승자를 출력
-> 이동거리가 가장 긴사람
8. 우승자는 다수가 가능

## 기능구현
- [X] 쉼표로 구분된 문자열을 분리하는 기능
- [X] 차량의 이름을 관리하는 클래스
- [X] 입력값에 따라 이동인지를 판별하는 기능 (Enum 타입으로 하였으나 외부 테스트용으로 적합하지않아 변경)
- [X] 전략패턴을 통하여 이동판별로 수정
- [X] 랜덤값 생성 유틸
- [X] 차량을 관리하는 클래스
- [X] 우승자 출력기능
- [X] 이동결과 출력기능

