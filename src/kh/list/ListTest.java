package kh.list;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kh.list.vo.JoinDateDesc;
import kh.list.vo.MemberNoDesc;
import kh.list.vo.MemberVo;
import kh.list.vo.NameAsc;

public class ListTest {
	public static void main(String[] args) throws Exception {

		// //리스트 객체를 생성 -> 다형성을 이용
		// List list = new ArrayList();
		// //값을 추가할때 사용하는 API
		// list.add(5);
		// list.add(7);
		// list.add(20);
		// list.add(5);
		//
		// //리스트 내 값의 갯수 확인
		// for(int i = 0 ; i < list.size() ; i++){
		// //리스트 -> 데이터의 순번이 존재 -> 인덱스 이용하여 값을 추출함
		// System.out.println(list.get(i));
		// }

		MemberVo mv1 = new MemberVo(10, "최범석", new Date());
		MemberVo mv2 = new MemberVo(20, "큰별", new Date(0));
		MemberVo mv3 = new MemberVo(30, "상원", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "보람", new Date(2280202029L));
		MemberVo mv5 = new MemberVo(50, "세준", new Date(88880202029L));
		MemberVo mv6 = new MemberVo(60, "승원", new Date(121880202029L));
		MemberVo mv7 = new MemberVo(70, "성미", new Date(121212121880202029L));

		// List list = new ArrayList();
		// //리스트(컬렉션) 객체 저장 가능(Object)
		// list.add(mv6);
		// list.add(mv1);
		// list.add(mv5);
		// list.add(mv3);
		// list.add(mv4);
		// list.add(mv7);
		// list.add(mv2);
		//
		// for(Object obj : list){
		// System.out.println((MemberVo)obj);
		// }

		// 제네릭 -> 해당 타입만 취급하겠다고 표시
		List<MemberVo> list = new ArrayList<MemberVo>();
		// 리스트(컬렉션) 객체 저장 가능(Object)
		list.add(mv6);
		list.add(mv1);
		list.add(mv5);
		list.add(mv3);
		list.add(mv4);
		list.add(mv7);
		list.add(mv2);

		for (MemberVo vo : list) {
			System.out.println(vo.toString());
		}

		list.remove(mv3);
		list.remove(0);
		System.out.println();
		for (MemberVo vo : list) {
			System.out.println(vo.toString());
		}

		// for(Object obj : list){
		// System.out.println((MemberVo)obj);
		// }
		//
		// System.out.println(list.size());
		//
		// 정렬에 사용하는 api -> Comparator -> 비교 기준을 정의
		list.sort(new NameAsc());

		for (Object obj : list) {
			System.out.println((MemberVo) obj);
		}
		System.out.println();
		// 값을 묶음으로 추출하여 가지고 있는 객체
		Iterator<MemberVo> iter = list.iterator();

		while (iter.hasNext()) { // 다음 칸에 값이 있습니까?
			System.out.println(iter.next());// 값을 추출할때 사용하는 메소드
		}

		ListIterator<MemberVo> listIter = list.listIterator();

		System.out.println();
		while (listIter.hasNext()) { // 다음 칸에 값이 있습니까?
			System.out.println(listIter.next());// 값을 추출할때 사용하는 메소드
			if (listIter.hasPrevious()) {
				System.out.println(listIter.previous());
				System.out.println(listIter.next());
			}
		}

		// 현재 list에 저장되어 있는 객체 값 중,
		// memberNo 값을 가지고 정렬하여 출력하시오.(단 no의 내림차순으로 정렬하시오)

		// 객체 정렬 기준 적용

		list.sort(new MemberNoDesc());

		System.out.println();
		for (MemberVo vo : list) {
			System.out.println(vo.toString());
		}

		list.sort(new JoinDateDesc());

		System.out.println();
		for (MemberVo vo : list) {
			System.out.println(vo.toString());
		}

	}
}
