package org.katheer.test;

import org.katheer.bean.OnairLms;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");
        OnairLms onairLms = (OnairLms) context.getBean("onairlms");
        onairLms.showAvailableCourses();
        onairLms.showAllFaculties();
        onairLms.showCourseCosts();
        onairLms.showStudentsList();
    }
}
