/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author saroven
 */
public class LabProject {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        LoginPageTest loginTest = new LoginPageTest("http://127.0.0.1:8000/login");

        //valid email and password

        if (loginTest.test("saroven@yahoo.com", "123456")) {
            System.out.println("First Test Case Success");
        } else {
            System.out.println("First Test Case Faild");
        }
        
        
        //Invalid email

        if (loginTest.test("saroven", "123456")) {
            System.out.println("Second Test Case - Login Success");
        } else {
            System.out.println("Second Test Case - Login Faild");
        }
        
         //Invalid Password

        if (loginTest.test("saroven@yahoo.com", "1234567")) {
            System.out.println("Second Test Case - Login Success");
        } else {
            System.out.println("Second Test Case - Login Faild");
        }
        
        
        RegistrationPageTest registrationPageTest = new RegistrationPageTest("http://127.0.0.1:8000/register");
        
        boolean result = registrationPageTest.test("roven", "ne4543434343455w@gmail.com", "123456", "Dhaka", "1234567890", "male");
        
        if(result) {
            System.out.println("Registration SuccessFul");
        }
    }

}
