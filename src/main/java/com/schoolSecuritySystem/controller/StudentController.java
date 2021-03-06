package com.schoolSecuritySystem.controller;


import com.schoolSecuritySystem.dto.StudentController.addNewStudentReq;
import com.schoolSecuritySystem.pojo.StudentInfo;
import com.schoolSecuritySystem.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

@Controller
@RequestMapping(value = "/Student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    /**
     *得到所有收到管理学生信息
     */
    @ResponseBody
    @PostMapping("/getAllStudentInfo")
    public List<StudentInfo> GetAllStudentInfo() { return studentService.getStudentList(); }

    /**
     *得到所有受到管理学生人数
     */
    @ResponseBody
    @PostMapping("/getAllStudentNum")
    public int GetAllStudentNum() { return studentService.getStudentNum(); }

    /**
     *添加管理新的学生
     */
    @ResponseBody
    @PostMapping("/addNewStudent")
    public boolean AddNewStudent(@RequestBody addNewStudentReq dto) { return studentService.addNewStudent(dto); }

    /**
     *修改学生信息
     */
    @ResponseBody
    @PostMapping("/editStudentInfo")
    public Boolean EditStudentInfo(@RequestBody addNewStudentReq dto) {return studentService.editStudentInfo(dto); }
}
