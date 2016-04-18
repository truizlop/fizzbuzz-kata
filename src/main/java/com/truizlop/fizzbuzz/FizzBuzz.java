package com.truizlop.fizzbuzz;

public class FizzBuzz {

    public String run(int number) {
        if(number % 15 == 0){
            return "fizzbuzz";
        }else if(number % 3 == 0) {
            return "fizz";
        }else if(number % 5 == 0) {
            return "buzz";
        }else{
            return String.format("%d", number);
        }
    }

}
