package main.com.mindtree;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
	public List<String> getNames(){
		List<String> list=new ArrayList<String>();
		list.add("Niranjan");
		list.add("Bhanu");
		list.add("Vishwa");
		System.out.println(list);
		return list;
	}
}
