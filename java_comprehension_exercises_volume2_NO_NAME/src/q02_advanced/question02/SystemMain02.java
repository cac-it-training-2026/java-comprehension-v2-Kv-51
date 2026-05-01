package q02_advanced.question02;

public class SystemMain02 {

	public static void main(String[] args) {
		ConsoleReader console = new ConsoleReader();
		Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		MemberManager.showAllMembers(Member.members);
	}

}
