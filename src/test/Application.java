package test;

import java.util.Arrays;

public class Application {
	public double simpleInterest(double p, double n, double r) {
		return (p*n*r)/100;
	}
	public double discount(double price, double percent) {
		return (price*percent)/100;
	}
	public int minValue(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}
}
