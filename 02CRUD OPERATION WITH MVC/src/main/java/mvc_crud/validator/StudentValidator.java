package mvc_crud.validator;

import mvc_crud.dao.StudentDao;
import mvc_crud.pojo.Student;
import mvc_crud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import java.util.regex.Pattern;

@Component
public class StudentValidator implements Validator {
    @Autowired
    private StudentService studentService;
    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

        Student student=(Student) o;
        System.out.println(student.getId());

        int id=student.getId();
        String name=student.getName()+" ";
        String mobile=student.getMobile();
        String address=student.getAddress();

    //        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"id","student.id.empty");
        if( studentService.getSingleStudent(id)!=null){
            errors.rejectValue("id","student.id.invalid","This Id already Exist ");
        }if( student.getId()==0 ){
            errors.rejectValue("id","student.ids.invalid","Please Enter a valid id");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name","student.name.empty");
        if(Character.isLowerCase(name.charAt(0))){
            errors.rejectValue("name","student.name.invalid","Invalid name");
        }
        if(studentService.getSingleStudentByName(student.getName())!=null){
            errors.rejectValue("name","student.nameEx.invalid","This Name already Exist ");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"mobile","student.mobile.empty");
        if (!mobile.isEmpty()  && !Pattern.compile("^[6789]\\d{9}$").matcher(mobile).matches()){
            errors.rejectValue("mobile","student.mobile.invalid","Invalid Mobile Number");
        }
        if(studentService.getSingleStudentByMobile(student.getMobile())!=null){
            errors.rejectValue("mobile","student.mobileEx.invalid","This Mobile Number already Exist ");
        }


        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"address","student.address.empty");
        if(!address.isEmpty()  && address.length()<5){
            errors.rejectValue("address","student.address.invalid","Invalid Address");
        }
    }
}
