
public class Initial {
	//�ڹ� ��ü �ʱ�ȭ �ܰ� (�ʵ带 �޸𸮿� �ʱ�ȭ�ϴ� ����)
	//1.�⺻�� �ʱ�ȭ - �ʵ� ��0�� �ش��ϴ� ��
	//int a; �� a=0 
	
	//2. ����� �ʱ�ȭ(�����ڸ� �Ⱦ���(�ν���Ʈ ���� X) �̸� �ʱⰪ �ο�)
	//       �����๮ ���� �Ұ�,���Ը� ����
	int a=10;
	
	//3. �ʱ�ȭ ��3-1.��static �ʱ�ȭ ��
	//	        3-2.��instance �ʱ�ȭ ��
	//**instance �� object ��ü
	//�޸𸮿� ������� ��ü(�޸𸮿� �ε� �� Ŭ����) = �ν��Ͻ� 
	static
	{//3.1
		System.out.println("static�ʱ�ȭ ��");
	}
	{//3.2
		System.out.println("instance�ʱ�ȭ ��");
		a=20;
	}
	
	//4. Constructor Method -�Ķ���͸� ���޹޾� �ʵ带 �ʱ�ȭ��
	public Initial(){
		System.out.println("4.constructor");
	}

}
