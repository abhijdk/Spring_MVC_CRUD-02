package mvc_crud.service;

import mvc_crud.pojo.Student;

import java.util.List;

public interface StudentService {
    /* Get all student details
    * @Param no , no is the number based on that i am going to done pagenation "
    * @return List<Student> */
    List<Student> getAllStudent(int no);

    //get single Record by Id
    Student getSingleStudent(int id);

    //get single Record by Id
    Student getSingleStudentByName(String name);

    //get single Record by Id
    Student getSingleStudentByMobile(String mobile);

    void studentAdd(Student student);

    void update(Student student);
    void delete(int id);

    public List<Student> countROw();

    public int size(int size);
}
