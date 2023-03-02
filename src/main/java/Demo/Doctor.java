package Demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    //tightly coupled - whenever we used doctor qualification must need
    //solution lightly coupled - if qualification not available should be working as well
    //testing should also be done different - soln: Dependency Injection
    //inversion of control
   // Qualification qualification;

   private String qualification;
   // private Qualification qualification1;
/*
    public Qualification getQualification1() {
        return qualification1;
    }

    public void setQualification1(Qualification qualification1) {
        this.qualification1 = qualification1;
    }

    public Doctor(String qualification) {
        this.qualification = qualification;
    }*/

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void assist() {
        System.out.println("Doctor is assisting...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name metho is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Metod is called");
    }


}
