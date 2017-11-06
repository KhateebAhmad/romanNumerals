package servicePackage;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumerals {

    @RequestMapping(method = RequestMethod.GET, value = "/convert")
    public String convertToRoman(String inputNumber){

        int input = Integer.parseInt(inputNumber);
        String output = "";
        
        if (input < 1 || input > 3999) {
            output = "Invalid Roman Number Value";
            return output;
        }
        
        while (input >= 1000) {
            output = output + "M";
            input = input - 1000;        
        }
        while (input >= 900) {
            output = output + "CM";
            input = input - 900;
        }
        while (input >= 500) {
            output = output + "D";
            input = input - 500;
        }
        while (input >= 400) {
            output = output + "CD";
            input = input - 400;
        }
        while (input >= 100) {
            output = output + "C";
            input = input - 100;
        }
        while (input >= 90) {
            output = output + "XC";
            input = input - 90;
        }
        while (input >= 50) {
            output = output + "L";
            input = input - 50;
        }
        while (input >= 40) {
            output = output + "XL";
            input = input - 40;
        }
        while (input >= 10) {
            output = output + "X";
            input = input - 10;
        }
        while (input >= 9) {
            output = output + "IX";
            input = input - 9;
        }
        while (input >= 5) {
            output = output + "V";
            input = input - 5;
        }
        while (input >= 4) {
            output = output + "IV";
            input = input - 4;
        }
        while (input >= 1) {
            output = output + "I";
            input = input - 1;
        }

        String message = "Input number "+inputNumber+" the corresponding number in Roman Numerals is: "+output;
        return message;
    }

}
