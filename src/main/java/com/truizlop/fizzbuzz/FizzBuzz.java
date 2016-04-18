package com.truizlop.fizzbuzz;

public class FizzBuzz {

    public String run(int number) {
        if(number % 3 == 0){
            return "fizz";
        }else{
            return String.format("%d", number);
        }
    }

}
