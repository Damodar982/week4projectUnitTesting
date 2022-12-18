package com.healthypersonapp;

import java.util.Comparator;
import java.util.List;

public class BMICalculator {
	
	private static final double BMI_THRESHOLD = 25.0;

	public static boolean isDietRecommended(double weight, double height) {
		if (height == 0.0) throw new ArithmeticException();
		double bmi = weight / (height * height);
		if (bmi < BMI_THRESHOLD)
			return false;
		return true;
	}

	public static Person findPersonWithWorstBMI(List<Person> persons) {
		return persons.stream().sorted(Comparator.comparing(BMICalculator::calculateBMI))
				.reduce((first, second) -> second).orElse(null);
	}

	public static double[] getBMIScores(List<Person> persons) {
		double[] bmiScores = new double[persons.size()];
		for (int i = 0; i < bmiScores.length; i++) {
			bmiScores[i] = BMICalculator.calculateBMI(persons.get(i));
		}
		return bmiScores;
	}

	private static double calculateBMI(Person person) {
		double height = person.getHeight();
		double weight = person.getWeight();
		if (height == 0.0)
			throw new ArithmeticException();
		double bmi = weight / (height * height);
		return Math.round(bmi * 100) / 100.0;
	}

}
