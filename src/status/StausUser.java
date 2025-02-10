/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi + macleagr
 */
public class StausUser 
{
   public void statusDetail(int code)
{
    System.out.println("User Status: " + Status.userOptions.values()[code]);
}
 
}
