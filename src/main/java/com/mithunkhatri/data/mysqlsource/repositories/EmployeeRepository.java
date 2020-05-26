package com.mithunkhatri.data.mysqlsource.repositories;

import com.mithunkhatri.data.mysqlsource.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
