```
import java.util.Scanner;  // 사용자 입력을 받기 위한 Ssanner 클래스 가져오기

public calss Main { 
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); // 입력을 받기 위해 Scanner 생성

      // 두 숫자 A와 B를 입력받기
      int A = Scanner.nextInt(); // 입력한 숫자 중 첫 번째 숫자를 A에 저장
      int B = Scanner.nextInt(); // 입력한 숫자 중 두 번째 숫자를 B에 저장

      // A와 B를 더한 결과 출력
      System.out.println(A + B);
  }
}
```

변수 알아보기(a,b를 변수(variable)라고 함
int a;
String b; 

변수 이름 지을 때 규칙
- 변수명은 숫자로 시작할 수 없음
- _와 $이외의 특수 문자는 사용할 수 없음
- int, class, return 등 자바 키워드는 변수명으로 사용 불가능

자료형 알아보기
int a; // 변수 a의 자료형은 int이다. (1,10,25 등의 정수만 담을 수 있음)
String b; // 변수 b의 자료형은 String이다. ("a", "hello" 등의 문자열만 담을 수 있음)

변수에 값 대입하기
- 변수를 선언한 후에는 변수에 값을 대입할 수 있음. 
- 이때는 ```=``` 기호 사용, ```=````은 대입 연산자(assignment operator)이라고 함
- 변수를 선언함과 동시에 값을 대입할 수도 있음
```
int a = `;
String b = "hello java";
```

자바 프로그램을 실행했더니 "생년월일(YYYY/MM/DD)을 입력해 주세요;"
사용자에게 문자열을 보여주는 것이 바로 콘솔 출력, 출력된 질문에 사용자가 답변하는 것을 콘솔 입력

Scanner
- J2SE 5.0부터 ``` java.util.Svanner ``` 클래스가 새로 추가
- 콘솔 입력을 보다 쉽게 입력 가능
- ``` java.util.Scanner ``` 클래스를 import 해야 함.
import java.util.Scanner; // Scanner 클래스는 생성자의 입력으로 System.in 객체가 필요한 데, 이는 콘솔 입력인 InputStream이 필요하다는 의미
Scanner 객체의 next() 메서드는 한 개의 토큰을 읽어들임. 
- next: 토큰을 읽어 들일 수 있다.
- nextLine: 라인을 읽어 들일 수 있다.
- nextInt: 정수를 읽어 들일 수 있다. 

콘솔 출력
``` System.out ```은 PrintStream 클래스의 객체
PrintStream은 콘솔에 값을 출력할 때 사용되는 클래스
``` System.out.println ```은 콘솔에 문자열을 출력할 때나 디버깅 할 때 많이 사용
``` System.err ``` : ``` System.out 과 동일한 역할. 다만 오류를 출력할 때 사용
