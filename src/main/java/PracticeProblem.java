public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static String pyramid(int base) {
		String pyramid = "";
		for(int row = 0; row < base; row++) {
			for(int spaces = 1; spaces < base - row; spaces++) {
				pyramid+=" ";
			}
			for(int asteriks = 0; asteriks <= row; asteriks++) {
				pyramid+="*";
				if(asteriks != row)
				pyramid+=" ";
			}
			if(row < base - 1)
			pyramid+="\n";
		}		
		return pyramid;

	}
	public static String square(int length) {
		String square = "";
		for(int row = 0; row < length; row++) {
			if(row == 0 || row == length - 1) {
				for(int asteriks = 0; asteriks < length; asteriks++) {
					square+="*";
				}
			}else{
				for(int asteriks = 0; asteriks < length; asteriks++) {
					if(asteriks != 0 && asteriks != length - 1)
					square+=" ";
						else
						square+="*";
					}
			}
			if(row != length - 1)
				square+="\n";
				
		}
		return square;

	}
	public static boolean hasLowercase(String s) {
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 97 && c <= 122)
				return true;
		}
		return false;
	}

}
