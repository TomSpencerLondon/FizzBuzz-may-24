package com.codurance;

import java.util.List;
import net.jqwik.api.Arbitraries;
import net.jqwik.api.Arbitrary;
import net.jqwik.api.ForAll;
import net.jqwik.api.Property;
import net.jqwik.api.Provide;

public class FizzBuzzTests {
  private final FizzBuzz fizzBuzz = new FizzBuzz();
  @Property
  boolean every_third_element_starts_with_Fizz(@ForAll("divisibleBy3") int i) {
    return fizzBuzz().get(i - 1).startsWith("Fizz");
  }

  @Provide
  Arbitrary<Integer> divisibleBy3() {
    return Arbitraries.integers().between(1, 100).filter(i -> i % 3 == 0);
  }

  private List<String> fizzBuzz() {
    return fizzBuzz.convert(1, 100);
  }
}
