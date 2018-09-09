package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Service;

import Model.Person;

@Service
public class PersonService {

	Hashtable<String, Person> hash = new Hashtable<String , Person>();
	List<Person> list = new ArrayList<Person>(); 
	PersonService()
	{
		
		Person p =new Person();
		p.setId(1);
		p.setAge(12);
		p.setName("Teper");
		p.setOccupation("fishing");
		
		Person p1 =new Person();
		p1.setId(2);
		p1.setAge(24);
		p1.setName("ankho");
		p1.setOccupation("alpta");
		
		Person p2 =new Person();
		p2.setId(3);
		p2.setAge(56);
		p2.setName("masom");
		p2.setOccupation("dekte");
		
		hash.put("1", p1);
		hash.put("2", p2);
		hash.put("3", p);
		
		list.add(p2);
		list.add(p1);
		list.add(p);
	
	}
	
	public Person getPerson(String s) 
	{
		if(hash.containsKey(s))
			return hash.get(s);
		else
			return null;
	}
	
	public List<Person> getAll()
	{
		return list;
	}
	
	
}
