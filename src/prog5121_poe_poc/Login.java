package prog5121_poe_poc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ctill
 */
public class Login 
{
        String loginSuccess ="Login Sucessfull";
    String loginFailure ="Login Failed" ;
    String storedUserName = "Mike";
    String storedPassword = "123456";
   

    public String loginUser(String userName, String password)
    {
        if(userName.equals(storedUserName) && password.equals(storedPassword))
        {
            return loginSuccess;
        }

        else
        {
            return loginFailure;
        }


    }
    
}
