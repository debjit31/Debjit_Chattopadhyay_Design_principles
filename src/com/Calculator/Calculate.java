package com.Calculator;

public class Calculate {
	
	private double a, b;
	public Calculate(double a, double b){
		this.a=a;
		this.b=b;
	}
	public double add(){
		double sum = this.a + this.b;
		return sum;
	}
	public double sub(){
		double diff = this.a-this.b;
		return diff;
	}
	public double mult(){
		return (this.a*this.b);
	}
	public double div(){
		return (this.a/this.b);
	}
}
