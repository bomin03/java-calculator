package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private final List<Integer> list = new ArrayList<>();

    public Integer calculate(int num1, int num2, char operator) {

        int results = 0;
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
                    throw new ArithmeticException("0으로 나눌 수 없습니다."); //
                }
                results = num1 / num2; // 나눗셈 결과 저장
                break; // switch문 탈출
            }
            default: { // 연산자가 아닌 경우
                System.out.println("지원하지 않는 연산자입니다.");
            }
        } // switch문 닫기
        list.add(results); // list에 결과 추가
            return results;
    }
    public List<Integer> getResult() {
            list.remove(0);
            return list;
        }
}
