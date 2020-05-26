package com.mithunkhatri.data.mysqlsource.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Key implements Serializable {
    private int empNo;
    private String deptNo;
}
