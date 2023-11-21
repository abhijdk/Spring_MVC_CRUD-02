package mvc_crud.service.impl;

import mvc_crud.dao.StudentDao;
import mvc_crud.pojo.Student;
import mvc_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> getAllStudent(int no) {

        return studentDao.showAllStudent(no);
    }

    @Override
    public Student getSingleStudent(int id) {
        try{
            return studentDao.getSingleStudent(id);
        }catch (Exception e){
            return null;
        }

    }

    @Override
    public Student getSingleStudentByName(String name) {
        try{
            return studentDao.getSingleStudentByName(name);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Student getSingleStudentByMobile(String mobile) {
        try{
            return studentDao.getSingleStudentByMobile(mobile);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public void studentAdd(Student student) {
        studentDao.studentAdd(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }

    @Override
    public void delete(int id) {
        studentDao.delete(id);
    }

    @Override
    public List<Student> countROw() {
        return studentDao.countROw();
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public int size(int size){
        int i=size%5;
        if(i==0){
            return size/=5;
        }else{
            size=(size/5)+1;
            return size;
        }
    }
}
