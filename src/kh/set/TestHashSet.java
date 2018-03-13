package kh.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import kh.list.vo.MemberVo;

public class TestHashSet {

	public static void main(String[] args) {

		Set set = new HashSet();
		// HashSet set1 = new HashSet();

		set.add(15);
		set.add(new Date());
		set.add(2.55);
		set.add(new Character('c'));
		set.add(new MemberVo(99, "이은영", new Date()));

		System.out.println(set.toString());
		// 출력값: [2.55, c, 99/이은영/2018-03-12, Mon Mar 12 21:15:03 KST 2018, 15]

		// 중복된 값 입력
		set.add(15);
		set.add(2.55);
		set.add(new Character('c'));
		System.out.println("==========================");
		System.out.println(set.toString());
		// 출력값: [2.55, c, 99/이은영/2018-03-12, Mon Mar 12 21:15:03 KST 2018, 15]
		// set은 중복된 값은 저장하지 않음. 첫번째와 같은 결과 출력

		System.out.println("포함된 값의 갯수: " + set.size());
		System.out.println("비어 있음 여부 확인: " + set.isEmpty());
		System.out.println("해당 객체 존재 여부 확인" + set.contains(15));
		System.out.println("배열로 변환: " + set.toArray());
		System.out.println("값 삭제: " + set.remove(2.55));
		System.out.println("값 삭제2: "+set.remove(2.55)); //삭제할 값 없음

	}

}
