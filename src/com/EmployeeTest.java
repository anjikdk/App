package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		Project p1 = new Project();
		p1.setPtojectName("JavaProject");
		Project p2 = new Project();
		p2.setPtojectName("C-Project");

		List<Project> projects1 = new ArrayList<Project>();
		projects1.add(p1);
		projects1.add(p2);

		Employee e1 = new Employee();
		e1.setFname("Ram");
		e1.setProjects(projects1);

		Project p3 = new Project();
		p3.setPtojectName("C#Project");
		Project p4 = new Project();
		p4.setPtojectName("JavaProject");

		List<Project> projects2 = new ArrayList<Project>();
		projects2.add(p3);
		projects2.add(p4);

		Employee e2 = new Employee();
		e2.setFname("Rajesh");
		e2.setProjects(projects2);

		employees.add(e1);
		employees.add(e2);

		System.out.println(employees);
		
		employees.stream().sorted(Comparator.comparing(Employee::getFname)).collect(Collectors.toList());

		List<String> projects = employees.stream().map(emp -> emp.getProjects()).flatMap(List::stream)
				.map(p -> p.getPtojectName())
//				.filter(p -> p.startsWith("J"))
				.distinct()
				.sorted()
				.collect(Collectors.toList());

		System.out.println(projects);

		Optional<List<Project>> projectList = employees.stream().map(emp -> emp.getProjects()).findAny();
		//System.out.println(projectList.get().size());
	}
}
