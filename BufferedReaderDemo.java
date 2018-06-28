//BufferedReader读取字符或字符串
package test;
import java.io.*;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		String str;
//使用BufferedReader创建字符流
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//使用read读取字符
System.out.println("输入字符，按‘q’键退出");
do {
	c = (char)br.read();//read读入单个字符
	System.out.println(c);
} while (c !='q');
//使用readline读取字符串
System.out.println("Enter lines of text.");
System.out.println("Enter 'end' to quit.");
do {
	str = br.readLine();
	System.out.println(str);
}while(!str.equals("end"));
	}

}

/**使用BufferedReader创建字符流,read和readline分别读取字符和字符串*/
