package com.ums.repository;

import com.ums.entity.Employee;
import com.ums.entity.OfficeBranch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IOfficeBranch extends JpaRepository<OfficeBranch, String> {


//    List<OfficeBranch> findByOfficeId(String id);
    
}
