package com.infotech.client;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.infotech.model.Department;
import com.infotech.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1009, "Sam", 90000.00, "sam@infotech.com");
		Employee e2 = new Employee(2009, "Ambay", 30000.00, "martin@infotech.com");
		Employee e3 = new Employee(3009, "Joya", 50000.00, "joya@infotech.com");
		Employee e4 = new Employee(4009, "Boya", 70000.00, "harry@infotech.com");
		Employee e5 = new Employee(5009, "Sean", 80000.00, "sean@infotech.com");
		
		Employee e6 = new Employee(5010, "Abrahim", 930000.00, "abrahim@infotech.com");
		
		
		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
	   // Map<Employee,Department> empDeptMap = new HashMap<>();
		Map<Employee,Department> empDeptMap = new ConcurrentHashMap<>();
		
		empDeptMap.put(e1, d1);
		empDeptMap.put(e2, d1);
		empDeptMap.put(e3, d1);
		
		empDeptMap.put(e4, d2);
		empDeptMap.put(e5, d2);
		
		//empDeptMap.put(null, d1);
		//empDeptMap.put(e6, null);
		
		Set<Entry<Employee, Department>> entrySet = empDeptMap.entrySet();
		Iterator<Entry<Employee, Department>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<Employee, Department> entry = (Map.Entry<Employee,Department>) iterator.next();
			Employee employee = entry.getKey();
			Department department = entry.getValue();
			System.out.println(employee);
			System.out.println(department);
			empDeptMap.put(e6, d2);
		}
	}
}
