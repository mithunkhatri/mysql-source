package com.mithunkhatri.data.mysqlsource.repositories;

import com.mithunkhatri.data.mysqlsource.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
}
