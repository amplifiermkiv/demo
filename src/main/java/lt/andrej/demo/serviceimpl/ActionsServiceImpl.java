package lt.andrej.demo.serviceimpl;

import lt.andrej.demo.service.ActionsService;
import org.springframework.stereotype.Service;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ActionsServiceImpl implements ActionsService {

    @Override
    public int sumValues(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public List<Integer> randomValueList0(int num1, int num2) {
        int min = num1;
        int max = num2;
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <=max; i++){
            list.add(i);
        }

        for (int i = 0; i <15; i++) {
            int currentNum = random(min, list.size());
            newList.add(list.get(currentNum));
            list.remove(currentNum);
        }
        return newList;
    }

    @Override
    public List<Integer> randomValueList() {
        int min = 0;
        int max = 25;
        /*
        List<Integer> list = new ArrayList<>();
        while () {
            if (list.contains(randomNum)) {
                list.add(randomNum);
            counter++;
            }
        }
         */
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i <=max; i++){
            list.add(i);
        }

        for (int i = 0; i <15; i++) {
            int currentNum = random(min, list.size());
            newList.add(list.get(currentNum));
            list.remove(currentNum);
        }
        return newList;
    }

    @Override
    public List<Integer> randomValuesDividedFour(int param) {
        int min = 0;
        int max = 1000;
        int counter = 0;
        List<Integer> list = new ArrayList<>();
        while (param > counter) {
            int randomNum =random(0, 1000);
            if (randomNum%4 == 0) {
                if (!list.contains(randomNum)) {
                    list.add(randomNum);
                    counter++;
                }
            }
        }
        return list;
    }

    private int random(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

}
