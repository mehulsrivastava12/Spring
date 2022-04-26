package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{22+11}")
	private int x;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int y;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{ new java.lang.String('Mehul Srivastava') }")
	private String name;
	
	@Value("#{8<10}")
	private boolean isActive;

	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
	}

	
	
	
	
	
}
