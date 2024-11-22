package com.ty.studentdb;

import java.util.Comparator;

public class SortStudentByName implements Comparator<Student> {
	public int compare(Student x, Student y) {
		return x.getId().compareTo(y.getId());
	}
}
