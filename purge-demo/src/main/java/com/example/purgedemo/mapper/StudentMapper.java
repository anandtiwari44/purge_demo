package com.example.purgedemo.mapper;

        import com.example.purgedemo.model.Student;
        import org.springframework.jdbc.core.RowMapper;

        import java.sql.ResultSet;
        import java.sql.SQLException;

public class StudentMapper implements RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setStudentName(resultSet.getString("studentName"));
        student.setCreateTimestamp(resultSet.getDate("createTimestamp"));
        return student;
    }
}
