//泛型的简单应用
//ArrayList<String> list = new ArrayList<String>() 就相当于指定集合存储的是String类型，作用就是指定了可存入集合的对象类型
package CollectionFrame;

import java.util.ArrayList;

public class Generics {
    public static <E> void printArray(E[] inputArray) {
		for (E e : inputArray) {
			System.out.printf("%s ",e);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组
 
        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组
 
        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组
	}

}
