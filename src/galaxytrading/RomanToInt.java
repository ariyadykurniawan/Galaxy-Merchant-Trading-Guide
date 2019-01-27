package galaxytrading;

public class RomanToInt {
	public int romanToInt(String str) {
		int result = 0;
		int length= str.length();
		
		for(int i = 0; i < length; i++) {
			int v1 = value(str.charAt(i));
			if(i+1 < length) {
				int v2 = value(str.charAt(i+1));
				
				if(v1 >= v2) {
					result += v1;
				}else {
					result += v2 - v1;
					i++;
				}
			}else {
				result += v1;
				i++;
			}
		}
		return result;
	}
	
	int value(char v) {
		if( v == 'I') {
			return 1;
		}else if(v == 'V') {
			return 5;
		}else if(v == 'X') {
			return 10;
		}else if(v == 'L') {
			return 50;
		}else if(v == 'C') {
			return 100;
		}else if(v == 'D') {
			return 500;
		}else if(v == 'M') {
			return 1000;
		}
		return 0;
	}
	
	double metalValue(String str) {
		if(str.equals("Silver")) {
			return 17;
		}else if(str.equals("Gold")) {
			return 14450;
		}else if(str.equals("Iron")) {
			return 195.5;
		}
		return 0;
	}
	
	char units(String str) {
		if(str.equals("glob")) {
			return 'I';
		}else if(str.equals("prok")) {
			return 'V';
		}else if(str.equals("pish")) {
			return 'X';
		}else if(str.equals("tegj")) {
			return 'L';
		}
		return 0;
	}

}
