import java.util.Arrays;

/**
 * һ�д�ӡ�žų˷���
 * 	for(int i = 1, j = 1; i <= 9; j++){
		// ������һ�У����������ȴ�ӡ*
		System.out.print(i+"*"+j+"="+i*j+"\t");
		// �ж��Ƿ��Ǵ�ӡ��ɱ������һ��*
		if(j == i){
			// ����
			System.out.println();
			// ����+1
			i++;
			// *��ͷ���¿�ʼ����
			j = 0;
		}
	}
 * @author hasee
 *
 */
public class Test {
public static void main(String[] args) {
	ReadListener readListener =new ReadListener();
	Student student=new Student();
	student.setReadListener(readListener);
	student.read();
//	//�۰���� �ռ临�Ӷ�o(1)
//	int arr[]={5,9,15,16,25,23,88};
//	int n=9;
//	int min=0; //��¼��Сֵ���±�
//	int max=arr.length-1;//��¼���ֵ���±�
//	int mid=(max+min)/2;
//	while(arr[mid]!=n)
//	{
//		if(arr[mid]>n)
//		{
//			max=mid-1;
//		}else{
//			min=mid+1;
//		}
//		if(min>max)
//		{
//			mid=-1;
//			break;
//		}
//		mid=(min+max)/2;
//	}
//	System.out.println(mid);
//}
//	/**
//	 * ѡ������
//	 * ��ѡ�����±��� ��Ԫ�غͱȽϵ��±��ϵ�Ԫ�ؽ��бȽ�
//	 */
//	int [] arr={1,34,2,7,45,22};
//	for(int i=1;i<arr.length;i++)
//	{
//		for(int j=i;j<arr.length;j++)
//		{
//			if(arr[i-1]>arr[j])
//			{
//				int tep=arr[i-1];
//				arr[i-1]=arr[j];
//				arr[j]=tep;
//			}
//		}
//	}
//	System.out.println(Arrays.toString(arr));
//	int []arr={3,34,12,6};
//	changeRef(arr);
//	System.out.println(Arrays.toString(arr));
	
}

//private static void changeRef(int[] arr) {
//	arr=new int[2];
//}

}
