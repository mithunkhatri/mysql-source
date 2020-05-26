package com.mithunkhatri.data.mysqlsource.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "dept_manager")
@AllArgsConstructor
@NoArgsConstructor
@Data
@IdClass(Key.class)
public class DepartmentManager {

    @Column(name = "emp_no")
    @Id
    private int empNo;

    @Column(name = "dept_no")
    @Id
    private String deptNo;

    @Column(name = "from_date")
    private Date fromDate;

    @Column(name = "to_date")
    private Date toDate;
}
