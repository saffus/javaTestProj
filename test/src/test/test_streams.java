package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test_streams {

	public static void main(String[] args)
	
	{
		String gitHubChabge;
		// TODO Auto-generated method stub
		
		techno t = new techno("1","java",1);
		techno t2 = new techno("2","python",2);
		techno t3 = new techno("3","net",3);
		techno t4 = new techno("4","angular",4);
		
		List<techno> a = new ArrayList<techno>();
		a.add(t);
		a.add(t2);
		List<techno> b = new ArrayList<techno>();
		a.add(t3);
		a.add(t4);
		
		employee emp1 = new employee(1,"sa",a);		
		employee emp2 = new employee(1,"sa",b);	
		List<employee> d = new ArrayList<employee>();
		d.add(emp1);
		d.add(emp2);
		List<Integer> h = Arrays.asList(1,2,3,4,5);
		//List<Integer> n =h.stream().mapToInt(i->i+1).
		
		List<String> p=d.stream().flatMap(emp-> emp.getTech().stream().map(name->name.getName())).collect(Collectors.toList());
		List<Integer> o=d.stream().flatMap(emp-> emp.getTech().stream().map(name->name.getDur())).map(j->j+1).collect(Collectors.toList());
		
		for(String s :p){
			System.out.println(s);
			
		}
		int[] ar = new int[]{1,2,3,4,5};
		int[] ab = new int[5];
		System.out.println(Arrays.stream(ab).average().orElse(0));
	
		 

	}

}

class employee {
	int id;
	String name;
	List<techno> tech;
	
	
	public employee(int id, String name, List<techno> tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<techno> getTech() {
		return tech;
	}
	public void setTech(List<techno> tech) {
		this.tech = tech;
	}
	
}
class techno{
	String id;
	String name;
	int dur;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	public techno(String id, String name, int dur) {
		super();
		this.id = id;
		this.name = name;
		this.dur = dur;
	}
	
	
}
