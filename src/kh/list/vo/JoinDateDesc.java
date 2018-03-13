package kh.list.vo;

import java.util.Comparator;

public class JoinDateDesc implements Comparator<MemberVo> {

	public int compare(MemberVo o1, MemberVo o2) {

		return (o1.getJoinDate().compareTo(o2.getJoinDate()));

	}

}
