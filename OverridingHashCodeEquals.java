package com.tricky;

import java.util.HashMap;
import java.util.Map;

public class OverridingHashCodeEquals {

	public static void main(String[] args) {
		hashMapImplementation();
	};

	private static void hashMapImplementation() {
		Map<Information, String> hm = new HashMap<>();
		hm.put(new Information(102, "Sridhar"), "Sridhar");
		hm.put(new Information(103, "Sridhar"), "Sridhar");
		System.out.println(hm.size());
	}

}

class Information {

	private int id;
	private String name;

	public Information(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Information other = (Information) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
