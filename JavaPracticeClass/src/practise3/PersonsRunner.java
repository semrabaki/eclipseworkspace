package practise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PersonsRunner {
//	Person person1 = new Person("Osman", "Yamata", 55);
//	Person person2 = new Person("Ahmet", "Yurt", 4);
//	Person person3 = new Person("Nihal", "Elmas", 23);
//	Person person4 = new Person("Osman", "Yavan", 15);
//	Person person5 = new Person("Selcuk", "Kar", 43);
//	Person person6 = new Person("Nedime", "Ozgur", 24);
	
	//Find the names with their repeated numbers
	
	//Find the unique names
	
	//Find the oldest person // create a method to return oldest person
	
	
	//sort all ages
	
	
	//generate emails for the users using first Initial of first name and last
    //name along with @gmail.com
	
	public static void main(String[] args) {
		
		//Find the names with their repeated numbers
		Person person1 = new Person("Osman", "Yamata", 55);
		Person person2 = new Person("Ahmet", "Yurt", 4);
		Person person3 = new Person("Nihal", "Elmas", 23);
		Person person4 = new Person("Osman", "Yavan", 15);
		Person person5 = new Person("Selcuk", "Kar", 65);
		Person person6 = new Person("Nedime", "Ozgur", 78);
		
		
		List <Person>persons= new ArrayList<>(); //here it is empty/null
		
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		persons.add(person6);
		
		System.out.println(persons);
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		for(Person p: persons)
		{
			if(!map.containsKey(p.getName()))
			{
				map.put(p.getName(), 1);
			}
			else
			{
				map.put(p.getName(), map.get(p.getName())+1);
			}
		}
		
		System.out.println(map);
		
		
		//Find the unique names
		
		Set<String> uniquePeople= new HashSet<>( map.keySet());
		
		System.out.println(uniquePeople);
		

		//System.out.println(oldestPerson(persons));
		
		Person oldestPerson= oldestPerson(persons);
		System.out.println("Oldest Person "+oldestPerson); //System.out.println(oldestPerson(persons));
		
		//sort all ages
		
		int []ages= new int[persons.size()];
		int index=0;
		
		for(Person p: persons)
		{
			ages[index]=p.getAge();
			index++;
		}
		//2.way for getting ages into an array
		/*
		  for(int i=0; i<=ages.length; i++)
		{
			ages[i]= persons.get(i).getAge();
		}
		 */
		
		
		System.out.println(Arrays.toString(ages));
		
		Arrays.sort(ages);
		
		System.out.println("Array sorted:"+ Arrays.toString(ages) );
		
		
		//generate emails for the users using first Initial of first name and last
		 //name along with @gmail.com
		
		allPersonWithEmail(persons);
		System.out.println(allPersonWithEmail(persons));
		
		
		
		
		
		
	}
	
	//Find the oldest person // create a method to return oldest person
	public static Person oldestPerson(List<Person> persons)
	{
		Person person= new Person();
		int maxAge= persons.get(0).getAge();
		for(int i=0; i<persons.size(); i++)
		{
			if(persons.get(i).getAge()>=maxAge)
			{
				maxAge=persons.get(i).getAge();
				person.setName(persons.get(i).getName());
				person.setLastName(persons.get(i).getLastName());
				person.setAge(persons.get(i).getAge());
			}
			
		}
		return person;
		
	}
	
	public static List<Person>allPersonWithEmail(List<Person>persons){
		
		for(int i=0; i<persons.size(); i++)
		{
			String firstInitial=persons.get(i).getName().substring(0,1);
			
			String lastName= persons.get(i).getLastName();
			
			String addition="gmail.com";
			
			persons.get(i).setEmail(firstInitial+lastName+addition);
			
			
		}
		
		
		return persons;
		
	}
}
