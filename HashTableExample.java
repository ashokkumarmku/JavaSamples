//$Id$
package hashtable;
import java.util.Hashtable;
public class HashTableExample {

	public static void main(String args[])
	{
		System.out.println("calling printHashTable inside main...");
		HashTableExample obj = new HashTableExample();
		obj.printHashTable();
	}
	public  void printHashTable()
	{
		Hashtable empList = new Hashtable(5);
		empList.put(1, "Thakur");
		empList.put(2, "Swamiji");
		empList.put(3, "Maa");
		int size = empList.size();
		int counter=1;
		for(;counter<=size;counter++)
		{
			System.out.println(empList.get(counter));
		}
		
	}
	
}
