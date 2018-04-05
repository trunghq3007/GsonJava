/**
 * 
 */
package main;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @description:
 * @author: Admin
 * @time: 6:03:42 PM
 * @date: Apr 2, 2018
 */
public class GsonJava {
	public static void main(String[] args) {
		// from json to java object
		System.out.println("from json to java object");
		String jsonStr = "{  'id': 10, 'name': 'Ram', 'address': {'city': 'Varanasi','zip':"
				+ " 221001 },'mobileNums': [ 111111, 222222 ]}";
		Gson gson = new Gson();
		Person person = gson.fromJson(jsonStr, Person.class);

		System.out.println(person.getName());
		System.out.println(person.getAddress().getCity());
		long mobNums[] = person.getMobileNums();
		System.out.println(mobNums[0]);

		// from object to json
		System.out.println("from object to json");
		Person person1 = new Person();
		createPerson(person1);
		System.out.println(gson.toJson(person1));

		// Pretty Printing for JSON Using Gson
		System.out.println("Pretty Printing for JSON Using Gson");
		Gson gson1 = new GsonBuilder().setPrettyPrinting().create();
		createPerson(person1);
		String jsonStr1 = gson1.toJson(person1);
		System.out.println(jsonStr1);
	}

	private static void createPerson(Person person) {
		person.setId(15);
		person.setName("Shyam");
		Address address = new Address();
		address.setCity("Allahabad");
		address.setZip("230043");
		person.setAddress(address);
		long[] mobNums = { 33333, 44444 };
		person.setMobileNums(mobNums);
	}

}
