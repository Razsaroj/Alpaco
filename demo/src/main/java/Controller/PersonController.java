package Controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Person;
import Service.PersonService;

@RequestMapping("/persons")
@RestController
public class PersonController {
	
	@Autowired
	PersonService ps;
	
	@RequestMapping(value="/all" , produces= {"application/xml", "application/json" })
	public List<Person> getAll()
	{
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public Person getPerson(@PathVariable("id") String id ) 
	{
		return ps.getPerson(id);
	}
}
