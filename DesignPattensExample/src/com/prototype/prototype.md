

# 프로토 타입 패턴 [prototype pattern]

## 1. 프로토타입 패턴 이란?

**새로운 객체를 만드는 대신 기존 객체의 복제**를 말하며 **요구 사항에 따라 사용자 정의** 할 수도 있다.

* 인스턴스를 복제하여 사용하는 구조
* 생성할 객체들의 타입이 프로토타입 인스턴스로부터 결정되도록 하는 디자인패턴
* 인스턴스는 새 객체를 만들기 위해 자신을 복제(clone)한다.

### 1) 프로토 타입 패턴의 장점
* 하위 분류의 필요성이 줄어 듭니다.
* 객체 생성의 복잡성을 숨깁니다.
* 클라이언트는 언떤 유형의 객체인지 모른채 새로운 객체를 얻을 수 있습니다.
* 런타임시 오브젝트를 추가하거나 제거 할 수 있습니다.

### 2) 프로토 타입 패턴 사용법
* 런타임시 클래스가 인스턴스화 될때
* 물체를 만드는 데 드는 비용이 비싸거나 복잡 할 때.
* 응용 프로그램의 클래스 수를 최소한으로 유지하려는 경우.
* 클라이언트 애플리케이션이 객체 생성 및 표현을 인식하지 못하는 경우.


### 3) 프로토 타입 패턴 예제를 위한 UML

![프로토타입패턴UML](https://www.javatpoint.com/images/designpattern/prototype.jpg)

1. Prototype 유형 의 getClone () 메소드를 포함 하는 인터페이스 Prototype 을 작성하려고 합니다.
2. 그런 다음 EmployeeRecord 객체의 복제 를 수행하는 Prototype 인터페이스 를 구현 하는 구체적인 클래스 EmployeeRecord 를 만듭니다.
3. PrototypeDemo 클래스 는이 concrete 클래스 인 EmployeeRecord를 사용합니다 .




### 참조 페이지
- javaTpoint - https://www.javatpoint.com/prototype-design-pattern
