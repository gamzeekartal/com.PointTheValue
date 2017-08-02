package com.pointTheValue;

public class TrafficSign {

	    int value;

	    //Just to be sure not to initialize the class with no value
	    private TrafficSign() {}

	    //Use always this
	    public TrafficSign(int val) {
	        this.value = val;
	    }

	    //Change the sign
	    public void setValue(int val) {
	        this.value = val;
	    }

	    //get randomly value, to learn the value of the reference
	    public int getValue(){
	        return value;
	    }

	    @Override
	    public String toString() {
	        return "TrafficSign [value=" + value + "]";
	    }

}
