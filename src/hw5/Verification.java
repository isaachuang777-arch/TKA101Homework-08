package hw5;

import java.security.SecureRandom;

public class Verification {

	private String codeBase = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	SecureRandom sr = new SecureRandom();

	public void genAuthCode() {

		char[] authcode = new char[8];

		for (int i = 0; i < 8; i++) {

			if (i < 2) {

				authcode[i] = codeBase.charAt(sr.nextInt(10));

			} else {

				authcode[i] = codeBase.charAt(sr.nextInt(codeBase.length()));

			}

		}

		for (int j = 7; j > 0; j--) {
			
			int shuffleNum = sr.nextInt(j+1);
			
			char temp = authcode[j];
			
			authcode[j] = authcode[shuffleNum];
			
			authcode[shuffleNum] = temp;  //必須將取得的數字或字元在存回洗牌組裡
		}

		String result = new String(authcode);

		System.out.println(result);

	}

	public static void main(String[] args) {

		Verification vr = new Verification();

		vr.genAuthCode();
	}

}
