package cn.novedu.service;

import cn.novedu.bean.StudentInfo;
import cn.novedu.bean.TeacherInfo;
import cn.novedu.bean.User;
import cn.novedu.constant.UserType;
import cn.novedu.jdbc.id.IdGenerator;
import cn.novedu.mapper.StudentInfoMapper;
import cn.novedu.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentInfoMapper studentInfoMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    IdGenerator idGenerator;

    public StudentInfo findById(String id) {
        return studentInfoMapper.findById(id);
    }

    public String insertStudent(String username, String name, String password) {
        User user = new User(username, name, password, UserType.STUDENT);
        int userInsertResult = userMapper.insert(user);
        StudentInfo studentInfo = new StudentInfo();
        studentInfo.setUsername(username);
        studentInfo.setName(name);
        int studentInfoInsertResult = studentInfoMapper.insertSelective(studentInfo);
        if (userInsertResult != 1 || studentInfoInsertResult != 1) {
            throw new RuntimeException();
        }
        return user.getId();
    }


}
