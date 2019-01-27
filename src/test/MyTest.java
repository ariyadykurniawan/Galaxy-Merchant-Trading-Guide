package test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import galaxytrading.RomanToInt;
import galaxytrading.StringToRoman;

class MyTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test1() {
		RomanToInt test1 = new RomanToInt();
	    assertEquals(2006, test1.romanToInt("MMVI"));
	}
	
	@Test
	void test2() {
		RomanToInt test2 = new RomanToInt();
	    assertEquals(1903, test2.romanToInt("MCMIII"));
	}
	
	@Test
	void test3() {
		RomanToInt test3 = new RomanToInt();
	    assertEquals(1944, test3.romanToInt("MCMXLIV"));
	}
	
	@Test
	void test4() {
		StringToRoman test4 = new StringToRoman();
	    assertEquals("pish tegj glob glob is 42", test4.stringToRoman("pish tegj glob glob"));
	}
	
	@Test
	void test5() {
		StringToRoman test5 = new StringToRoman();
	    assertEquals("pish tegj prok is 45", test5.stringToRoman("pish tegj prok"));
	}
	
	@Test
	void test6() {
		StringToRoman test6 = new StringToRoman();
	    assertEquals("I have no idea what you are talking about", test6.stringToRoman("woodchuck chuck if a woodchuck could chuck wood"));
	}
	
	@Test
	void test7() {
		StringToRoman test7 = new StringToRoman();
	    assertEquals("glob prok Silver is 68 Credits", test7.stringToRoman("glob prok Silver"));
	}
	
	@Test
	void test8() {
		StringToRoman test8 = new StringToRoman();
	    assertEquals("glob prok Gold is 57800 Credits", test8.stringToRoman("glob prok Gold"));
	}
	
	@Test
	void test9() {
		StringToRoman test9 = new StringToRoman();
	    assertEquals("glob prok Iron is 782 Credits", test9.stringToRoman("glob prok Iron"));
	}
	
	@Test
	void test10() {
		StringToRoman test9 = new StringToRoman();
	    assertEquals("tegj pish Silver is 1020 Credits", test9.stringToRoman("tegj pish Silver"));
	}
	
}
