package com.employee;

import java.util.ArrayList;

public class Payrollsystem {

   private ArrayList<Employee> employeeList;

   public Payrollsystem(){
       employeeList=new ArrayList<>();
   }

   public void addEmployee(Employee employee){
       employeeList.add(employee);
   }

   public boolean removeEmployee(String Id){
       boolean ispresent=false;

       for(Employee employee: employeeList){
           if(employee.getId().equals(Id)){
               employeeList.remove(employee);
               ispresent=true;
               break;
           }
       }
       return ispresent;
   }

   public void displayEmployee(){

       for(Employee employee : employeeList){
           System.out.println(employee.toString());
       }

   }

   public boolean checkEmployee(String Id){

       boolean ispresent=false;

       for(Employee employee : employeeList){

           if((employee.getId()).equals(Id)){
               ispresent=true;
           }
       }
       return ispresent;
   }

}
