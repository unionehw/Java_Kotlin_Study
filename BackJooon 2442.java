import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // 입력을 받기 위한 Scanner

    int N = scanner.nextInt(); // N 입력받기

    // 1번째 줄부터 N번째 줄까지 출력       
    for (int i = 1; i <=N; i++) {                 
    // (N - i)개의 공백 출력
      for(int j = 1; j<=N - i; j++) [           
        System.out.print(" ");                    // 공백 출력
    }
      // (2 * i -`)개의 별 출력
      for (int k =1; k<=2 * i-1; k++) {           // 별의 갯수(2n-1)
          System.out.print(" ");
       }
      // 줄 바꿈
      System.out.println();
    }
  }
}

N: 총 줄의 갯수
i번째 줄에 공백의 개수: N - i
i번째 줄에 별의 개수: 2 x i - 1
