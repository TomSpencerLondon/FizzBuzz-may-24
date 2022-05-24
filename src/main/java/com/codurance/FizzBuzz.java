package com.codurance;

public class FizzBuzz {

  public String convert(int input) {
    String result;
    if (input % 15 == 0) {
      result = "FizzBuzz";
    } else if (input % 5 == 0) {
      result = "Buzz";
    } else if (input % 3 == 0) {
      result = "Fizz";
    } else {
      result = Integer.toString(input);
    }
    return result;
  }
}
