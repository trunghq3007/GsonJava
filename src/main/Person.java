/**
 * 
 */
package main;

/**
 * @description:
 * @author: Admin
 * @time: 6:05:58 PM
 * @date: Apr 2, 2018
 */
public class Person {
	private int id;
	private String name;
	private Address address;
	private long[] mobileNums;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long[] getMobileNums() {
		return mobileNums;
	}

	public void setMobileNums(long[] mobileNums) {
		this.mobileNums = mobileNums;
	}
}
