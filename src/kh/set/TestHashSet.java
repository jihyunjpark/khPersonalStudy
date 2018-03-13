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
		set.add(new MemberVo(99, "������", new Date()));

		System.out.println(set.toString());
		// ��°�: [2.55, c, 99/������/2018-03-12, Mon Mar 12 21:15:03 KST 2018, 15]

		// �ߺ��� �� �Է�
		set.add(15);
		set.add(2.55);
		set.add(new Character('c'));
		System.out.println("==========================");
		System.out.println(set.toString());
		// ��°�: [2.55, c, 99/������/2018-03-12, Mon Mar 12 21:15:03 KST 2018, 15]
		// set�� �ߺ��� ���� �������� ����. ù��°�� ���� ��� ���

		System.out.println("���Ե� ���� ����: " + set.size());
		System.out.println("��� ���� ���� Ȯ��: " + set.isEmpty());
		System.out.println("�ش� ��ü ���� ���� Ȯ��" + set.contains(15));
		System.out.println("�迭�� ��ȯ: " + set.toArray());
		System.out.println("�� ����: " + set.remove(2.55));
		System.out.println("�� ����2: "+set.remove(2.55)); //������ �� ����

	}

}
