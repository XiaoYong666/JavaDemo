package com.example.demo_jpa.dao;

import com.example.demo_jpa.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<Student,Integer> {
     /**
     *  新增Sql语句查询数据
     **/
    @Query(value = "SELECT * FROM student",nativeQuery = true)
    List<Student> getAllBySql();
}
