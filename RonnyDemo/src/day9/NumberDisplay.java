package day9;

public class NumberDisplay {
	private int limit;
	private int value;

	//setter:set a value for a variable
	//limit = xxx
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	//value = xxx
	public void setValue(int value) {
		//when local variable is in the same name as global variable, we use this.variableName to refer the global variable
		this.value = value;
	}
	
	//getter: to get the value of a variable
	/*
	//??? is the type of the value you return
	public ??? getSomething(){
		return something;
	}
	*/
	public int getLimit(){
		return limit;
	}
	
	public int getValue(){
		return value;
	}
	
	
	public NumberDisplay(int limit) {
		this.limit = limit;
		value = 0;
	}

//	public String getDisplayValue() {
//		if (value < 10) {
//			return "0" + value;
//		} else {
//			return "" + value;
//		}
//	}
}
