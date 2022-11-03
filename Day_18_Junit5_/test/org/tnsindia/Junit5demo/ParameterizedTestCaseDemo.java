package org.tnsindia.Junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BooleanSupplier;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestCaseDemo {
	/*@DisplayName("Roman Numerial")
	@ParameterizedTest(name="\"{0}\"should be (1)")
	@CsvSource({"I,1","II,2"})
	void withNicName (String word,int number){} */
	@ParameterizedTest
	@ValueSource(strings = {"racecar","radar","able was I ere saw leba"})
	void palindromes(String candidate) {
		assertTrue(isPalindrome(candidate));
	}

	private BooleanSupplier isPalindrome(String candidate) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
