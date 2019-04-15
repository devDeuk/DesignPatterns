# 싱글톤 [Singleton pattern]

## 1. 싱글톤 이란
```
"하나의 인스턴스만 있고 그것에 대한 전역 엑세스 지접을 제공하는 클래스를 정의"
즉, 클래스는 단일 인스턴스만 만들어야하며, 단일 개체는 다른 모든 클래스에서 사용 할 수 있다"
```

### 1) 싱글톤 패턴 종류
* Early Instantiation: 로드 타임에 인스턴스 생성
* Lazy Instantiation: 필요한 경우 인스턴스 생성

### 2) 싱글톤 패턴 장점
* 장점
 	- 각 요청마다 객체가 생성되지 않으므로 메모리를 절약합니다. 단일 인스턴스만 반복해서 재사용

### 3) 싱글톤 패턴 사용법
* 싱글톤 패턴은 주로 멀티 스레드 및 데이터베이스 응용프로그램에서 사용됩니다.
* 로킹, 캐싱, 스레드 풀, 구성 설정 등에 사용됨

### 4) 싱글톤 패턴 UML

![싱글톤패턴UML](https://www.javatpoint.com/images/designpattern/singleton.jpg)


### 5) 싱글톤 패턴 생성방법

- 싱글톤class를 만들려면 클래스의 정적멤버, private 생성자, 정적 팩토리 메소드 

1. **Static member** : 정적 이기 때문에 메모리를 한번만 가져옴, Singleton 클래스의 인스턴스를 포함
2. **private constructor** : 클래스 외부에서 Singleton 클래스를 인스턴스화 하는 것을 방지
3. **Static factory method* ***  : Singleton 개체에 대한 전역 액세스 지점을 제고하고 인스턴스를 호출자에게 반환









### 참조 페이지
- javaTpoint - http://https://www.javatpoint.com/singleton-design-pattern-in-java
