public class ArgsArray{
	public static void main(String []args)
	{
		//args�� �ΰ��� ���ڸ� �о ����غ���
		String str1=args[0];
		String str2=args[1];
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		System.out.println("�� ���� ��="+(str1+str2));
		/*�̷��Ը� �ϸ� str�� �׳� ��Ƽ���̱� ������ 
		java ArgsArray 10 20 ������ �μ������� 1020���� ����
		30 ���� �������ϱ����ؼ� ������ ��ȯ�ؾ���*/

		//String�� �⺻�� int�� ��ȯ�ϴ� ���
		//Integer��� Wrapper class�� �̿��ؼ� ��ȯ�غ���
		int su1=Integer.parseInt(str1); //���ڿ��� ������ �ٲ���
		//parseInt�� Integer��� wrapperŬ������ ���� �޼���
		int su2=Integer.parseInt(str2);
		System.out.println("�� ���� ��="+(su1+su2));
	}
}