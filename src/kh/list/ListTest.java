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

		// //����Ʈ ��ü�� ���� -> �������� �̿�
		// List list = new ArrayList();
		// //���� �߰��Ҷ� ����ϴ� API
		// list.add(5);
		// list.add(7);
		// list.add(20);
		// list.add(5);
		//
		// //����Ʈ �� ���� ���� Ȯ��
		// for(int i = 0 ; i < list.size() ; i++){
		// //����Ʈ -> �������� ������ ���� -> �ε��� �̿��Ͽ� ���� ������
		// System.out.println(list.get(i));
		// }

		MemberVo mv1 = new MemberVo(10, "�ֹ���", new Date());
		MemberVo mv2 = new MemberVo(20, "ū��", new Date(0));
		MemberVo mv3 = new MemberVo(30, "���", new Date(952280202029L));
		MemberVo mv4 = new MemberVo(40, "����", new Date(2280202029L));
		MemberVo mv5 = new MemberVo(50, "����", new Date(88880202029L));
		MemberVo mv6 = new MemberVo(60, "�¿�", new Date(121880202029L));
		MemberVo mv7 = new MemberVo(70, "����", new Date(121212121880202029L));

		// List list = new ArrayList();
		// //����Ʈ(�÷���) ��ü ���� ����(Object)
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

		// ���׸� -> �ش� Ÿ�Ը� ����ϰڴٰ� ǥ��
		List<MemberVo> list = new ArrayList<MemberVo>();
		// ����Ʈ(�÷���) ��ü ���� ����(Object)
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
		// ���Ŀ� ����ϴ� api -> Comparator -> �� ������ ����
		list.sort(new NameAsc());

		for (Object obj : list) {
			System.out.println((MemberVo) obj);
		}
		System.out.println();
		// ���� �������� �����Ͽ� ������ �ִ� ��ü
		Iterator<MemberVo> iter = list.iterator();

		while (iter.hasNext()) { // ���� ĭ�� ���� �ֽ��ϱ�?
			System.out.println(iter.next());// ���� �����Ҷ� ����ϴ� �޼ҵ�
		}

		ListIterator<MemberVo> listIter = list.listIterator();

		System.out.println();
		while (listIter.hasNext()) { // ���� ĭ�� ���� �ֽ��ϱ�?
			System.out.println(listIter.next());// ���� �����Ҷ� ����ϴ� �޼ҵ�
			if (listIter.hasPrevious()) {
				System.out.println(listIter.previous());
				System.out.println(listIter.next());
			}
		}

		// ���� list�� ����Ǿ� �ִ� ��ü �� ��,
		// memberNo ���� ������ �����Ͽ� ����Ͻÿ�.(�� no�� ������������ �����Ͻÿ�)

		// ��ü ���� ���� ����

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
