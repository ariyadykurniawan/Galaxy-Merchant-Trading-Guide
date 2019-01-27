package galaxytrading;

public class StringToRoman {
	
	public String stringToRoman(String str) {
		String[] arr = str.split(" ");
		String metal = "";
		String roman = "";
		String res = "";
		
		RomanToInt obj = new RomanToInt();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("Silver") || arr[i].equals("Gold") || arr[i].equals("Iron")) {
				metal = arr[i];
			}else {
				roman += obj.units(arr[i]);
			}
		}
		
		int result = obj.romanToInt(roman);
		double metalValue = obj.metalValue(metal);
		
		if(result != 0 && metalValue == 0) {
			res = str + " is " + result;
		}else if(result != 0 && metalValue != 0) {
			result = (int) (result * metalValue);
			res = str + " is " + result + " Credits";
		}else {
			res = "I have no idea what you are talking about";
		}
		
		return res;
	}

}
