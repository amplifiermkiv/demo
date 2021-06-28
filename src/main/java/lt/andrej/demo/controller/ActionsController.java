package lt.andrej.demo.controller;

import lt.andrej.demo.service.ActionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/action")
public class ActionsController {

    @Autowired
    ActionsService actionsService;

    @RequestMapping("sum/{num1}/{num2}")
    public int sum (@PathVariable int num1, @PathVariable int num2){
        int result = actionsService.sumValues(num1, num2);
        return result;
    }

    @RequestMapping("substraction/{num1}/{num2}")
    public int substraction (@PathVariable int num1, @PathVariable int num2) {
        int result = actionsService.substraction(num1, num2);
        return result;
    }

    @RequestMapping("randomValueList/{num1}/{num2}") // cia idomesnis variantas, kai galima parinkti random range pvz http://localhost:8081/action/randomValueList0/0/30
    public List<Integer> randomValueList0 (@PathVariable int num1, @PathVariable int num2) {
        List<Integer> result = actionsService.randomValueList0(num1, num2);
        return result;
    }

    @RequestMapping("randomValueList")
    public List<Integer> randomValueList () {
        List<Integer> result = actionsService.randomValueList();
        return result;
    }
    /*
    Panaudodami masyvą arba listą atvaizduojame 100 vnt.
    atsitiktinai sugeneruotų skaičių nuo 1 iki 1000, kurie dalinasi iš 4.
     */

    @RequestMapping("randomValuesDividedFour/{param}")
    public List<Integer> randomValuesDividedFour (@PathVariable int param) {
        List <Integer> result = actionsService.randomValuesDividedFour(param);
        return result;
    }

}
