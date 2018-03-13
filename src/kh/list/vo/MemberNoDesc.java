package kh.list.vo;

import java.util.Comparator;

public class MemberNoDesc implements Comparator<MemberVo> {

	@Override
	public int compare(MemberVo o1, MemberVo o2) {

		// int result = -100;
		// if(o1.getMemberNo() > o2.getMemberNo()){
		// result=51;
		// }
		// return result;
System.out.println(123);
		return o2.getMemberNo() - o1.getMemberNo();

	}
}
