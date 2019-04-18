# 빌더 디자인패턴 [Builder Pattern

## 1. 빌더 패턴 이란?

단계별 접근 방식을 사용하여 간단한 객체로 복잡한 개체를 구성

* 복잡한 인스턴스를 조립하여 만드는 구조
* 복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를 만들 수 있게 하는 패턴

![빌더패턴UML](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f3/Builder_UML_class_diagram.svg/500px-Builder_UML_class_diagram.svg.png)


### 1) 빌더 패턴의 장점
* 객체의 구성과 표현을 명확하게 구분합니다.
* 건설 공정을 보다 잘 제어 할 수 있습니다.
* 객체의 내부 표현을 변경하는 기능을 지원합니다.


### 2) 빌더 패턴 예제를 위한 UML
예1)
![빌더패턴UML](https://www.javatpoint.com/images/designpattern/builderuml1.jpg)

빌더패턴의 예)
1. Packing 인터페이스 만들기
2. 2가지 추상 클래스 만들기 CD 및  company
3. company의 2가지 구현 클래스 생성 (sony, samsung)
4. CDType 클래스 만들기
5. CDBuilder 클래스 만들기
6. BuilderDemo 클래스 만들기 



예2)
![빌더패턴 예제2](https://www.javatpoint.com/images/designpattern/builderuml2.jpg)



