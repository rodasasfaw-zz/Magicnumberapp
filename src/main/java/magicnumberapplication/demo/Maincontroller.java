package magicnumberapplication.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController

public class Maincontroller {
    @RequestMapping("/getnum")
   public String shownum(@RequestParam("num") int num){
        int starting_num = num;
                    int counter = 0;

                     String magicnum = "";

                     while(num > 1){

                         if(num % 2 == 0)
                             num/= 2;
                         else
                             num = (num * 3) + 1;

                         counter++;
                         magicnum = magicnum+Integer.toString(num) + "  ";

                         }


return "Starting number is: "+Integer.toString(starting_num)+"</br>"+Integer.toString(starting_num)+"  "+magicnum;
                 }




}

