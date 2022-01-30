package com.tricky;

import java.util.HashSet;

public class UserObjectsInHashSet {

	public static void main(String[] args) {
		userDefinedObjectsInHashSet();
	}

	private static void userDefinedObjectsInHashSet() {
		HashSet<Employee> hs = new HashSet<>();
		hs.add(new Employee(101, "XXX"));
		hs.add(new Employee(101, "YYY"));
		System.out.println("Hashset size => " + hs.size());
	}

}

class Employee {
	private Integer id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((id == 0) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
