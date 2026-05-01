package q02_advanced.question02;

import java.util.List;

public class MemberManager {
	/**
	 * コンストラクタ
	 */
	private MemberManager() {
		//privateにしてインスタンス化禁止
	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int targerId, String newPassword) {
		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				found = true;
				break;
			}
		}
	}
}
