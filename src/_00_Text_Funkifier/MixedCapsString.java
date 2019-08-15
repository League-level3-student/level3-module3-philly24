package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String mixCap = "";
		for (int i = 0; i < s.length(); i++) {
			if (i%2 == 0) {
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
