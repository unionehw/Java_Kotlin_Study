```
import java.util.Scanner; // 사용자 입력을 받기 위한 Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력을 받기 위해 Scanner 생성

        int N = Scanner.nextInt(); //N 입력받기

        // 1부터 N까지 반복하며 출력
        for (int i =1; i <=N; i++) {   // 반복문을 사용해 i를 1부터 N까지 증가시키며 출력
              System.out.println(i);
        }
    }
}
```

for문의 기본 구조
```
String[] numbers = {"one", "two", "three"};
for(int i=o; i<numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

for (초기치; 조건문; 증가치) {
  ...
}

