package com.gl.test.pack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.healthypersonapp.BMICalculator;
import com.healthypersonapp.Person;

public class BMICalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_ReturnTrue_When_DietRecommended() {
		assertTrue(BMICalculator.isDietRecommended(75, 1.6));
	}
	@Test
	public void should_ReturnFalse_When_DietRecommended() {
		assertFalse(BMICalculator.isDietRecommended(60, 1.7));
	}
	@Test(expected = ArithmeticException.class)
	public void should_ThrowArithmeticException_When_HeightZero() {
	    BMICalculator.isDietRecommended(75,0);
	}
	@Test
	public void should_ReturnPersonWithWorstBMI_When_PersonListNotEmpty() {
	    List<Person> persons = Arrays.asList(
	            new Person(70, 1.6),
	            new Person(80, 1.7),
	            new Person(90, 1.9));
	             BMICalculator.findPersonWithWorstBMI(persons);

}
}
