package com.mithunkhatri.data.mysqlsource.repositories;

import com.mithunkhatri.data.mysqlsource.entities.Department;
import com.mithunkhatri.data.mysqlsource.entities.DepartmentManager;
import com.mithunkhatri.data.mysqlsource.entities.Key;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentManagerRepository extends JpaRepository<DepartmentManager, Key> {
}
