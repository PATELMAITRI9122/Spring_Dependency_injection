package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {

    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       // Doctor staff = context.getBean(Doctor.class);
        //staff.assist();

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("MBBS");
//        System.out.println(doctor);
//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1);


        /*
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       // Staff staff = context.getBean(Doctor.class);
        Doctor staff = context.getBean(Doctor.class);
        staff.assist();
        System.out.println(staff.getQualification());


        Doctor doctor = context.getBean(Doctor.class);

        Doctor doctor = new Doctor();
        doctor.assit();

        Qualification qualification = context.getBean(Qualification.class);*/



    }

}
