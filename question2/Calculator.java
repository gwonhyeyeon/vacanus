package question2;


class Calculator {
	
	private int result;
	
	 public Calculator add(int num) {
	        result += num;
	        return this;
	    }

	 public Calculator substract(int num) {
	        result -= num;
	        return this;
	    }

	 public int out() {
	        return result;
	    }	

}
