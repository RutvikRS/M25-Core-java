package org.tnsindia.Junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	@RepeatedTest(5)
	void test() {
		System.out.println("Hello  M25");
	}

}
