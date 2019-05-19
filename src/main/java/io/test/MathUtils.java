/**
 * 
 */
package io.test;

/**
 * @author Bhabadyuti Bal
 *
 */
public class MathUtils {
	
	public int add(int a, int b) {
		return a + b;	
	}

	/*
	 * 
	 */
	public double computeCircleArea(double radius) {
		//Pi*r^2
		double area = Math.PI * radius * radius;
		return area;
	}
	
}
