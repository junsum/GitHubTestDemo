import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyThreadPrinter2  {   
	 public static void main(String[] args) {
//		String str2="12接口";
//		System.out.println(str2.substring(2,5));
//		char[] cs={'1','2','3'};
//		System.out.println( cs.toString());
//		int index=0;
//		Matcher slashMatcher=Pattern.compile(str1).matcher(str2);
//		while(slashMatcher.find())
//		{
//		 System.out.println(slashMatcher.start());
//		}
//		boolean[] bs=new boolean[str2.length()];
//		for(int i=0;i<bs.length;i++)
//		{
//			if(bs[i])
//				continue;
//			char c=str2.charAt(i);
//			int count=0;
//			for(int j=i;j<bs.length;j++)
//			{
//				if(c==str2.charAt(j))
//				{
//					count++;
//					bs[j]=true;
//				}
//			}
//			System.err.println(c+":"+count);
//		}
//		try {
//			byte[] bs=str2.getBytes("gbk");
//			String sub=new String(bs,0,4,"gbk");
//			if(sub.charAt(sub.length()-1)!=str2.charAt(sub.length()-1))
//				sub=new String(bs,0,3,"gbk");
//			System.out.println(sub);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		
//		String str="abcda";
//		String sub="a";
//		int index=0;
//		System.out.println(str.length());
//		while(index<str.length())
//		{
//			index=str.indexOf(sub,index);
//			if(index!=-1)
//			{
//				System.out.println(index);
//				index++;
//			}else{
//				break;
//			}
//		}
//		 String str = "我我我我我我我我爱爱爱爱学学学习习习习习习习习习习习";
//		 System.out.println(str.replaceAll("(.)\\1+","$1"));
//		 String str = "0dhsol5bkldf62nlsdn3nl7752";
//		 String[] strs=str.split("\\d");
//		 System.out.println(Arrays.toString(strs));
//		 String email="178230@qq.com";
//		 System.out.println(email.matches("[a-zA-Z0-9]{6,32}@[a-zA-Z0-9]+(\\.com)"));
		 String str="sadsdfsda";
		 while(str.length()>0)
		 {
			 char c=str.charAt(0);
			 int len=str.length();
			 str=str.replaceAll(""+c, "");
			 System.out.println(c+":"+(len-str.length()));
		 }
	}
}  
 