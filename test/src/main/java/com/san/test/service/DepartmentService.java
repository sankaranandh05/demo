package com.san.test.service;

import com.san.test.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();
}
