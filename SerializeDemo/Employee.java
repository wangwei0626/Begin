//需要序列化的类必须实现 java.io.Serializable接口；类能不能被序列化，也需要看它能否支持次接口
package SerializeDemo;

public class Employee implements java.io.Serializable{
String name;
String address;
Number SSN;
int    number;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Number getSSN() {
	return SSN;
}
public void setSSN(Number sSN) {
	SSN = sSN;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}

}
