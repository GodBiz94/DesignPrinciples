package com.myapp.design.principles;

public class Circle extends Shape {

	Circle(double r) {
		super(r);
	}

	@Override
	public void rotate() {

		System.out.println("Rotating " + getClass().getSimpleName());
	}

	@Override
	public void playSound() {

		System.out.println("Playing sound file " + getClass().getSimpleName());
	}

	public void area() {

		System.out.println("Circle Area : " + Math.PI * getRadius() * getRadius());
	}
}
