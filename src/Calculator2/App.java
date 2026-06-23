package Calculator2;

import Calculator.Calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator Calculator = new Calculator();
        String exit = "";

        while(!exit.equals("exit")){
            System.out.println("첫 번째 숫자를 입력하세요.");
            int num1 = sc.nextInt();

            System.out.println("두 번째 숫자를 입력하세요.");
            int num2 = sc.nextInt();

            if(num1 < 0) {
                System.out.println("0을 포함한 양의 정수만 가능합니다.");
                return;
            }
            if(num2 < 0) {
                System.out.println("0을 포함한 양의 정수만 가능합니다.");
                return;
            }
            System.out.println("사칙연산 기호를 입력하세요.");
            char operator = sc.next().charAt(0);
            Integer result = Calculator.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            System.out.println("현재 저장된 결과들: " + Calculator.getResult());
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes), 다음은 아무 값 입력");
            String answer = sc.next();
            if(answer.equalsIgnoreCase("yes")){
                Calculator.getResult();
                System.out.println("가장 먼저 저장된 결과 삭제 후: " + Calculator.getResult());
            }
            System.out.println("종료를 원하면 exit / 계속 진행하려면 아무거나 입력");
            exit = sc.next();
        }
        System.out.println("계산기를 종료합니다.");
        sc.close();
    }
}
