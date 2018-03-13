package kh.list.vo;

import java.util.Comparator;

public class NameAsc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		MemberVo member1 = (MemberVo) o1;
		MemberVo member2 = (MemberVo) o2;

		return (member1.getMemberName()).compareTo(member2.getMemberName());

	}

}
