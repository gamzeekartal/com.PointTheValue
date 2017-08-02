package com.pointTheValue;

public class Road {

	public static void main(String[] args) {
		
		TrafficSign s1 = new TrafficSign(40);
		TrafficSign s2 = new TrafficSign(20);
		TrafficSign s3 = new TrafficSign(50);
		
		System.out.println("s1: " + s1.getValue() + " s2: " + s2.getValue() + " s3: " + s3.getValue());
		
		alterSignValue(s2,35);
		System.out.println("s1: " + s1.getValue() + " s2: " + s2.getValue() + " s3: " + s3.getValue());
		
		alterSignValue(s1,45);
		System.out.println("s1: " + s1.getValue() + " s2: " + s2.getValue() + " s3: " + s3.getValue());
		
		alterSignValue(s1,65);
		System.out.println("s1: " + s1.getValue() + " s2: " + s2.getValue() + " s3: " + s3.getValue());
		
	}
	
	public static void alterSignValue(TrafficSign sign, int signValue){
		
		sign.setValue(signValue);
		System.out.println(sign.getValue());		
	}

}
