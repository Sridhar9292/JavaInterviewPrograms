package com.tricky;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

	private static List<Employee5> empList = Arrays.asList(new Employee5(1, "Sridhar271", 27),
			new Employee5(1, "Sridhar272", 27), new Employee5(1, "Sridhar241", 24), new Employee5(1, "Sridhar242", 24));

	public static void main(String[] args) {
		convertListToMap();
	}

	private static void convertListToMap() {

		Map<Integer, List<Employee5>> empMap = empList.stream().collect(Collectors.groupingBy(Employee5::getAge));

		System.out.println(empMap);

	}

}

class Employee5 {

	private int id;
	private String name;
	private Integer age;

	public Employee5(int id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Employee5 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
