package com.karabel;

import java.io.FileNotFoundException;
import java.io.FileReader;

class UserNotFoundException extends RuntimeException{}

//---------------------------------------
//data-layer
//---------------------------------------
class UserRepository{
    public String findUser(int userId){
        // persist data
        boolean isUserFound=false;
        if(!isUserFound)
            throw new UserNotFoundException();
        return "CengizhanKarabel";
    }
}
//---------------------------------------
//Service-layer
//---------------------------------------
class UserService{
    UserRepository userRepository=new UserRepository();
    public boolean subscribe(int userId){
        // process data
        String user=userRepository.findUser(userId);
        //...
        return true;
    }
}
//---------------------------------------
//Web-layer
//---------------------------------------
class UserController{
    UserService userService=new UserService();
    public void doHandleRequest(String request){
        // handle request & response
        int userId=123;
        try {
            userService.subscribe(userId);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        return;
    }
}





public class Ex {
    public static void main(String[] args) {


        // Thread-1 : single-stack-trace
        UserController userController=new UserController();
        userController.doHandleRequest("req-123");


        //--------------------------------------------------


        try {
            FileReader fileReader=new FileReader("file1.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

//        -----------------------------------------------------------


    }
}