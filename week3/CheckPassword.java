package classEx2;

public class CheckPassword {
	
	public static boolean isPasswordValid(String password) {
		
		int digitCount = 0;
		int upperCaseCount = 0;
		int symbolCount = 0;

		char[] symbols = new char[] {'_', '@', '#', '$', '/', '&'};
		
		for (int i = 0; i < password.length(); i ++) {
			if (Character.isDigit(password.charAt(i))){
				digitCount += 1;
			}
			if (Character.isUpperCase(password.charAt(i))){
				upperCaseCount +=1;
			}
			for (char element : symbols) {
				if (element == password.charAt(i)) {
					symbolCount += 1;
				}
			}
		}
		if (password.length() >= 8 && digitCount >=1 && upperCaseCount >= 1 && symbolCount >= 1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String [] passwordList =  {"Iam@strongpassword1", "iamweakpassword", "AA19@_bb", "testingPassword", "abcd" };
		for (int i=0; i < passwordList.length; i++) {
			System.out.println(passwordList[i]);
			if (isPasswordValid(passwordList[i])) {
				System.out.println("The password is valid.\n");
			}
			else {
				System.out.println("The password is not valid.\n");
			}
		}
	}
}
