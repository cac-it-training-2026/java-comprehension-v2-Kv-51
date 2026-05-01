package q01_basic.question05;

public class MemberManager {
	private MemberManager() {
	}//privateにすることでインスタンス生成を禁止できるらしい

	public static void showAllMembers(AbstMember[] members) { //戻り値はMember型
		for (AbstMember member : members) {
			member.showMember(); //配列（が入った変数）memberがループしてて各値でshowMemberが呼び出される
		}
	}
}
