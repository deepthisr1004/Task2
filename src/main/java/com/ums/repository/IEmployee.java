package com.ums.repository;

import com.ums.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IEmployee extends JpaRepository<Employee, String> {

    @Query(value = "SELECT e.employee_name " +
            "FROM Employee e " +
            "JOIN office_branch ob ON e.office_branch_id = ob.id " +
            "JOIN Office o ON ob.office_id = o.id " +
            "WHERE o.region = :region", nativeQuery = true)
    List<String> findByOfficeRegion(@Param("region") String region);


}