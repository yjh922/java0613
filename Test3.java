class  Test3{
	//main �޼���� �����ڰ� �������� �ʴ� �� �̹� �ڹ� ���� ���س��� ����� �Լ��̴�.
	//���� �Ű����� ���� ���� �̹� ������ �ִ�.
	//�� ���������� main()�޼����� �Ű������� ������ �˾ƺ���.
	//main()�޼���� ���� ȣ���� �Ұ��ϸ�, main()�� ȣ���ϱ� ���ؼ��� ����
	//java.exe�� ���� ȣ��ȴ�.
	//ex) java Ŭ������ ���ڿ�1,���ڿ�2,���ڿ�3
	public static void main(String[] args){
		System.out.println("����� ����� �ѱ� �Ű������� ����"+args.length);
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}
