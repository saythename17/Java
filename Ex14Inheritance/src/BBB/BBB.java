package BBB;

import Inheritance2.AAA;

public class BBB extends AAA {

	//�̹� AAA�� ������� 4���� �����ϳ� ����
	void show() {
		//System.out.println(a);--- private
		//a�� �ʵ�μ� �������� �ν������� private(Access Modifier)�� ���� ���� �Ұ�
		//System.out.println(b);--- (default)
		//default�� �ٸ� package���� ���� �Ұ�
		System.out.println(c);//protected
		//���� package������ ��밡���ϳ� ���������� ��Ӱ��迡���� ���� ���
		System.out.println(d);//public---��𼭵� ���
	}
}


