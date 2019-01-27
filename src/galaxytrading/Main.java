package galaxytrading;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInt obj = new RomanToInt();
		StringToRoman obj2 = new StringToRoman();
		
		String str = "XLII";
		String str2 = "pish tegj glob glob";
		String str3 = "glob prok Silver";
		String str4 = "glob prok Gold";
		String str5 = "glob prok Iron";
		String str6 = "wood could a woodchuck chuck if a woodchuck could chuck wood";
		
		System.out.println("Convert Number : " + obj.romanToInt(str));
		System.out.println(obj2.stringToRoman(str2));
		System.out.println(obj2.stringToRoman(str3));
		System.out.println(obj2.stringToRoman(str4));
		System.out.println(obj2.stringToRoman(str5));
		System.out.println(obj2.stringToRoman(str6));
	}

}
