package org.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input = null;
            bufferedReader.readLine();

            while ((input = bufferedReader.readLine()) != null) {
               // System.out.println(input);
                String[] tokens = (input.toString()).split("\\|");

               var employeeId =  Integer.parseInt(tokens[0]);
               var employeeName = tokens[1];
               var hoursWorked = Double.parseDouble(tokens[2]);
               var payRate = Double.parseDouble(tokens[3]);

               Employee e = new Employee(employeeId, employeeName, hoursWorked,payRate);
               // System.out.println(e);
                System.out.printf("\nId:%d\nName:%s\nPay:%.2f"+ "\n", e.getEmployeeId(),e.getName(),e.getGrossPay());
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}