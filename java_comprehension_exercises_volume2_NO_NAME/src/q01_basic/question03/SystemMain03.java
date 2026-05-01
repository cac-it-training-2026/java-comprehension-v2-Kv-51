package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member("Miura Data", 28, 2);

		member1.showMember();

		System.out.println("---SHOW DATA(Miura)---");

		member2.showMember();
	}

}
