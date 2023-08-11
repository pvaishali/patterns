package file;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
	int cust_id;
	String name;
	int accno;
	String pwd;
	int balance;

	public Customer(int cust_id, String name, int accno, String pwd, int balance) {
		super();
		this.cust_id = cust_id;
		this.name = name;
		this.accno = accno;
		this.pwd = pwd;
		this.balance = balance;
	}

	void display() 
	{
     System.out.println(cust_id);
     System.out.println(name);
     System.out.println(accno);
     System.out.println(pwd);
     System.out.println(balance);
	}
}

public class Launch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
Customer c1=new Customer(1,"virat",18,"Anu143",700000);
c1.display();
String path1="C:\\FileProgs1\\Customer.txt";
FileOutputStream fos=new FileOutputStream(path1);
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(c1);


	}

}
