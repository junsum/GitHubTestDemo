import java.util.Arrays;

/**
 * 一行打印九九乘法表
 * 	for(int i = 1, j = 1; i <= 9; j++){
		// 无论哪一行，上来都是先打印*
		System.out.print(i+"*"+j+"="+i*j+"\t");
		// 判断是否是打印完成本行最后一个*
		if(j == i){
			// 换行
			System.out.println();
			// 行数+1
			i++;
			// *从头重新开始计数
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
//	//折半查找 空间复杂度o(1)
//	int arr[]={5,9,15,16,25,23,88};
//	int n=9;
//	int min=0; //记录最小值的下标
//	int max=arr.length-1;//记录最大值的下标
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
//	 * 选择排序
//	 * 拿选定的下标上 的元素和比较的下标上的元素进行比较
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
