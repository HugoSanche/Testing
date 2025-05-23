package com.mycode.test;

import com.mycode.test.models.CollegeStudent;
import com.mycode.test.models.StudentGrades;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootTest(classes = MvcTestingExampleApplication.class )
public class ApplicationExampleTest {
    private static int count=0;

    @Value("${info.app.name}")
    private String appInfo;

    @Value("${info.app.description}")
    private String appDescription;

    @Value("${info.app.version}")
    private String appVersion;

    @Value("${info.school.name}")
    private String schoolName;

    @Autowired
    CollegeStudent student;

    @Autowired
    StudentGrades studentGrades;

    public void beforeEach(){
        count=count+1;
        System.out.println("Testing: "+appInfo+" witch is "+appDescription +
                           "Version: "+appVersion+". Execution of test method "+count);
        student.setFirstname("Eric");
        student.setLastname("Roby");
        student.setEmailAddress("hugo.baltazar@gmail.com");
        studentGrades.setMathGradeResults(new ArrayList<>(Arrays.asList(100.0,85.0,76.50,91.78)));
        student.setStudentGrades(studentGrades);

    }

    @Test
    void basicTest(){

    }

}
