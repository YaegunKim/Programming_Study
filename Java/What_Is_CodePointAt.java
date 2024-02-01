public class What_Is_CodePointAt {
		


    public String largestOddNumber(String num) {

     	int number;
		final int size = num.length();

		for(int i = size - 1; i >= 0; i--){
            
			number = (int)num.codePointAt(i) - 48;
			if ((number ^ 1) == (number + 1))
				continue;

			return num.substring(0, i + 1);
		}
		
		return "";

    }
}