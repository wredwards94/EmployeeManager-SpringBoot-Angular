package com.wesleyedwards.PracEmployeeApi.repository;

import com.wesleyedwards.PracEmployeeApi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findAllByDeletedFalse();

    Optional<Employee> findByIdAndDeletedFalse(Long id);
}
