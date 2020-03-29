package com.pilaniya.employeeapi.controller;

import com.pilaniya.employeeapi.Repository.EmployeeRepository;
import com.pilaniya.employeeapi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @PostMapping("/add")
    public List<Employee> addEmployee(@RequestBody Employee employee){
         employeeRepository.save(employee);
         return employeeRepository.findAll();
    }

    @PutMapping("/update/{id}")
    public Optional<Employee> updateEmployee(@RequestBody Employee employee, @PathVariable Long id){
        employeeRepository.save(employee);
        return employeeRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public List<Employee> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return employeeRepository.findAll();
    }
}
