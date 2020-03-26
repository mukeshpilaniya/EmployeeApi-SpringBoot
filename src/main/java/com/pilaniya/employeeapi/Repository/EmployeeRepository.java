package com.pilaniya.employeeapi.Repository;

import com.pilaniya.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
