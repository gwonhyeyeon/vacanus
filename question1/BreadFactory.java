package question1;

public class BreadFactory {
	
	public Bread getBread(String breadType) {
		if(breadType == null) {
			return null;
		}
		
		switch (breadType) {
		case "cream":
			return new CreamBread();
		case "sugar":
			return new SugarBread();
		case "butter":
			return new ButterBread();
		}
		return null;
	}

}
