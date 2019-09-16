package com.example.purgedemo.service;

import com.example.purgedemo.mapper.StudentMapper;
import com.example.purgedemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurgeService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAllStudents(){
        String sql = "SELECT * FROM Student";
        RowMapper<Student> mapper = new BeanPropertyRowMapper<Student>(Student.class);
        return this.jdbcTemplate.query(sql,mapper);
    }

}
