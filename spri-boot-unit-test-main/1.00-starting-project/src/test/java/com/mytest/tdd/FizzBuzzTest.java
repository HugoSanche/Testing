package com.mytest.tdd;

import com.luv2code.tdd.FizzBuzz;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number is divisible by 3, print Fizz
    @DisplayName("Divisible by Three")
    @Test
    @Order(1)
    void testForDivisibleByThree(){
        String expected="Fizz";
        assertEquals(expected, FizzBuzz.computer(3),"Should return Fizz");
    }
    // If number is divisible by 5, print Buzz
    @DisplayName("Divisible by Five")
    @Test
    @Order(2)
    void testForDivisibleByFive(){
        String expected="Buzz";
        assertEquals(expected, FizzBuzz.computer(5),"Should return Buzz");
    }
    // If number is divisible by 3 and 5, print FizzBuzz
    @DisplayName("Divisible by Three and Five")
    @Test
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected="FizzBuzz";
        assertEquals(expected, FizzBuzz.computer(15),"Should return FizzBuzz");
    }
    // If number is NOT divisible by 3 or  5, then print the number
    @DisplayName("Not Divisible by Three or Five")
    @Test
    @Order(4)
    void testForNotDivisibleByFiveOrThree(){
        String expected="11";
        assertEquals(expected, FizzBuzz.computer(11),"Should return 1");
    }

    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name="value={0},expected={1}")
    @CsvFileSource(resources = "/small-test-data.csv")
    @Order(6)
    void testSmallDataFile(int value,String expected){
        assertEquals(expected, FizzBuzz.computer(value));
    }
    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name="value={0},expected={1}")
    @CsvFileSource(resources = "/medium-test-data.csv")
    @Order(6)
    void testMediumDataFile(int value,String expected){
        assertEquals(expected, FizzBuzz.computer(value));
    }
    @DisplayName("Testing with Medium data file")
    @ParameterizedTest(name="value={0},expected={1}")
    @CsvFileSource(resources = "/large-test-data.csv")
    @Order(7)
    void testLargeDataFile(int value,String expected){
        assertEquals(expected, FizzBuzz.computer(value));
    }
}



















