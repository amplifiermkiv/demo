package lt.andrej.demo.service;

import java.util.List;

public interface ActionsService {
    int sumValues(int num1, int num2);
    int substraction(int num1, int num2);
    List<Integer> randomValueList0(int num1, int num2);
    List<Integer> randomValueList();
    List<Integer> randomValuesDividedFour(int param);

}
