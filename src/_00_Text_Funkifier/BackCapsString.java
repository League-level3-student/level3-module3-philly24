package _00_Text_Funkifier;

public class BackCapsString extends SpecialString {

	public BackCapsString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  String funkifyText(String s) {
		// TODO Auto-generated method stub
		
		String mixCap = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (i%2 != 0) {
				char lowerCase = Character.toLowerCase(s.charAt(i));
				mixCap += lowerCase;
			}
			else {
				char upperCase = Character.toUpperCase(s.charAt(i));
				mixCap += upperCase;
			}
			
		}
		return mixCap;
	}

}
