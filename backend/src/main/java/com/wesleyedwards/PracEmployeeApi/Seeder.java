package com.wesleyedwards.PracEmployeeApi;

import com.wesleyedwards.PracEmployeeApi.entities.Address;
import com.wesleyedwards.PracEmployeeApi.entities.Employee;
import com.wesleyedwards.PracEmployeeApi.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Seeder implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee = new Employee();
        employee.setFirst_name("Wesley");
        employee.setLast_name("Edwards");
        employee.setPhoneNum("864-349-7884");

        Address address = new Address();
        address.setStreet("105 Oak Valley Drive");
        address.setCity("Simpsonville");
        address.setState("South Carolina");
        address.setZipcode("29681");

        employee.setAddress(address);

        employeeRepository.saveAndFlush(employee);

        Employee employee1 = new Employee();
        employee1.setFirst_name("Felicia");
        employee1.setLast_name("Edwards");

        Address address1 = new Address();
        address1.setStreet("1270 Polo Rd Apt 537");
        address1.setCity("Columbia");
        address1.setState("South Carolina");
        address1.setZipcode("29223");
        employee1.setPhoneNum("404-502-7391");

        employee1.setAddress(address1);

        employeeRepository.saveAndFlush(employee1);
    }
}
