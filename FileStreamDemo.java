//OutputStreamWriter/InputStreamWriter,一个流被定义为一个数据序列。输入流用于从源读取数据，输出流用于向目标写数据。
package test;

import java.io.*;

public class FileStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//创建文件对象，将字符流写入到文件里
File f = new File("a.txt");
//构建FileOutputStream对象，文件不存在会自动创建
FileOutputStream fop = new FileOutputStream(f);
//构建OutputStreamWriter对象,参数可以指定编码
OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
//写入到缓存区
writer.append("中文输入");
//换行
writer.append("\r\n");
//写入到缓存区
writer.append("English");
//关闭写入流,同时会将缓存区内容写入到文件里
writer.close();
//关闭输出流，释放系统资源
fop.close();

//读取文件中的字符，输出到控制台
FileInputStream fip = new FileInputStream(f);
//构建InputStreamWriter对象,参数可以指定编码
InputStreamReader reader = new InputStreamReader(fip,"UTF-8");
StringBuffer str = new StringBuffer();
while(reader.ready()) {
	//将char加到stringbuffer中
	str.append((char)reader.read());
}
System.out.println(str.toString());
//关闭读取流
reader.close();
//关闭输入流,释放系统资源
fip.close();
}
}

