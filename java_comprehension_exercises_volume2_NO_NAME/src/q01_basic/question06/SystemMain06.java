package q01_basic.question06;

import java.io.IOException;

public class SystemMain06 {

	public static void main(String[] args) {

		ConsoleReader cr = new ConsoleReader(); //インスタンス生成
		int inputId = 0;
		String inputPassword = null;
		String name = "Miura Manabu";
		int age = 28;
		int rank = 2;

		System.out.println("---CREATE MEMBER DATA---");

		try {
			System.out.print("input id>>");
			inputId = cr.inputNumber(); //crインスタンスクラスのinputNumber呼び出し

			System.out.print("input id>>");
			inputPassword = cr.inputString(); //crインスタンスクラスのinputString呼び出し	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}

		Member member = new Member(inputId, inputPassword, name, age, rank); //インスタンス生成

		member.showMember();

	}

}
