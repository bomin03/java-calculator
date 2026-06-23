package Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // 입력 받는 Scanner 생성
        String exit = "";


        while (!exit.equals("exit")) { // exit 입력 전까지 반복
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번째 정수 입력 받고 저장


            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번째 정수 압력 받고 저장


            // 0을 포함한 양의 정수 만들기
            if (num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return; // 첫 번째 숫자가 0보다 작으면 위 문구 출력과 함께 프로그램 종료
            }
            if (num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 입력 가능합니다.");
                return; // 두 번째 숫자가 0보다 작으면 위 문구 출력과 함께 프로그램 종료
            }
            System.out.println("사칙연산 기호를 입력하세요."); // 사칙연산 기호 입력
            char operator = sc.next().charAt(0); // 문자열 입력 받는 Scanner 사용해서 첫 번째 인덱스에 해당하는 글 뽑기
            int results; // 계산 결과 저장 변수
            switch (operator) {
                case '+':
                    results = num1 + num2;
                    break;
                case '-':
                    results = num1 - num2;
                    break;
                case '*':
                    results = num1 * num2;
                    break;
                case '/': {
                    if (num2 == 0) { // 만약 두 번째 숫자가 0일 경우
                        System.out.println("0으로 나눌 수 없습니다."); // <- 문구 출력
                        return; // 출력과 동시에 프로그램 종료
                    }
                    results = num1 / num2; // 나눗셈 결과 저장
                    break; // switch문 탈출
                }
                default: { // 연산자가 아닌 경우
                    System.out.println("지원하지 않는 연산자입니다."); // <- 문구 출력
                    return; // 프로그램 종료
                }
            }
            System.out.println("결과: " + results); // 계산 결과 출력
            System.out.println("종료를 원하면 exit / 계속 진행하려면 아무거나 입력"); // 종료 및 진행 여부 묻기
            exit = sc.next(); // 입력을 받아 exit 변수에 저장
        }
        sc.close(); // Scanner 객체 해제
        System.out.println("계산기를 종료합니다."); // <- 문구 출력 후 종료
    }
}