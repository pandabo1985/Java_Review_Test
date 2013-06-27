package com.panda.java.test.memory;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class ReferenceQueueTest {

	public static void main(String[] args) {

		// ����һ������
		Person person = new Person("Sunny");
		// ����һ�����ö���
		ReferenceQueue<Person> rq = new ReferenceQueue<Person>();
		// ����һ�������ã��ô����������õ�person����
		PhantomReference<Person> pr = new PhantomReference<Person>(person, rq);
		// �ж�person���ñ����Ͷ��������
		person = null;
		// ��ͼȡ�������������õĶ���
		// ���ֳ��򲢲���ͨ�������÷��ʱ����ö������Դ˴����Ϊnull
		System.out.println(pr.get());
		// ǿ����������
		System.gc();
		System.runFinalization();
		// ��Ϊһ���������еĶ��󱻻��պ󣬸������þͻ�������ö�����
		// �����ö��������Ƚ��������������pr���бȽϣ����true
		System.out.println(rq.poll() == pr);

	}
}