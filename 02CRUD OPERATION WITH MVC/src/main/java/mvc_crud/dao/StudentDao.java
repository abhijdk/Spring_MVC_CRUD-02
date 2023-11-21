package mvc_crud.dao;

import mvc_crud.pojo.Student;

import java.util.List;

public interface StudentDao {
    List<Student> showAllStudent(int no);

    Student getSingleStudent(int id);

    Student getSingleStudentByName(String name);
    Student getSingleStudentByMobile(String mobile);

    void studentAdd(Student student);

    void update(Student student);
    void delete(int id);

    public List<Student> countROw();
}
