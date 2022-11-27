/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author HP
 */

// Importing scanner class
import java.util.Scanner;

// Super Class
// Person class
class Person{
    
    protected String name;
    protected int age;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
}

// Interface
// Operations interface
interface Operations{
    public void create();
    public void show();
    public void update();
}

// Abstraction through interface
// Medicine Class
class Medicine implements Operations{
    
    private String name;
    private String dose;
    private Double price;
    
    // Composition
    private Scanner sc = new Scanner(System.in);
    
    // Aggregation
    private Scanner sc1;
    
    Medicine(){
        name = "";
        dose = "";
        price = 0.0;
    }
    
    @Override
    public void create(){
        System.out.println("\n---------------------------");
        System.out.println("Creating new medicine: ");
        System.out.println("---------------------------");
        
        System.out.println("\nAdd new medicine: ");
        
        System.out.print("\nEnter medicine name: ");
        name = sc.nextLine();
        
        System.out.print("Enter medicine dose: ");
        dose = sc.nextLine();
        
        System.out.print("Enter medicine price: ");
        price= sc.nextDouble();
    }
    
    @Override
    public void show(){
        System.out.println("\n---------------------------");
        System.out.println("Medicine Details");
        System.out.println("---------------------------");
        System.out.println("\nMedicine name: "+name);
        System.out.println("Medicine dose: "+dose);
        System.out.println("Medicine price: "+price);
    }
    
    @Override
    public void update(){
        //
    }
    
    public void update(Scanner s){
        String choice;
        sc1 = s;
        System.out.println("\n---------------------------");
        System.out.println("Updating medicine details: ");
        System.out.println("---------------------------");
        
        System.out.println("\nMedicine to update: ");
        
        System.out.println("\nMedicine name: "+name);
        System.out.println("Medicine dose: "+dose);
        System.out.println("Medicine price: "+price);
        
        System.out.println("\n---------------------------");
        System.out.println("Choose an option: ");
        System.out.println("---------------------------");
        
        System.out.println("\nPress 1 to update name");
        System.out.println("Press 2 to update dose");
        System.out.println("Press 3 to update price");
        
        choice = sc1.nextLine();
        
        switch (choice) {
            case "1":
                System.out.print("\nEnter new name of the medicine: ");
                name = sc1.nextLine();
                break;
            case "2":
                System.out.print("\nEnter new dose of the medicine: ");
                dose = sc1.nextLine();
                break;
            case "3":
                System.out.print("\nEnter new price of the medicine: ");
                price = sc1.nextDouble();
                break;
            default:
                System.out.println("\nPlease enter valid option");
                break;
        }
    }
}

// Inheritance
// Staff Class
class Staff extends Person{
    private String designation;
    private double salary;
    
    Staff(){
        name = "";
        age = 0;
        designation = "";
        salary = 0.0;
    }
    
    // getters
    public String getDesignation(){
        return designation;
    }
    
    public double getSalary(){
        return salary;
    }
    
    // setters
    public void setDesignation(String designation){
        this.designation = designation;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("\n---------------------------");
        System.out.println("Staff Details");
        System.out.println("---------------------------");
        System.out.println("\nStaff Name: "+getName());
        System.out.println("Staff Age: "+getAge());
        System.out.println("Staff Designation: "+getDesignation());
        System.out.println("Staff Salary: "+getSalary());
    }
}

// Abstraction through interface
// Prescription Class
class Prescription implements Operations{
    private String patient_name;
    private String patient_gender;
    private String disease;
    
    // Composition
    private Scanner sc1 = new Scanner(System.in);
    
    // Aggregation
    private Scanner sc;
    
    Prescription(){
        patient_name = "";
        patient_gender = "";
        disease = "";
    }
    
    @Override
    public void create(){
    
    }

    public void create(Scanner s){
        sc = s;
        
        System.out.println("\n---------------------------");
        System.out.println("Creating new prescription: ");
        System.out.println("---------------------------");
        
        System.out.println("\nEnter prescription details: ");
        
        System.out.print("\nEnter patient name: ");
        patient_name = sc.nextLine();
        
        System.out.print("Enter patient gender: ");
        patient_gender = sc.nextLine();
        
        System.out.print("Enter patient disease: ");
        disease = sc.nextLine();
    }
    
    @Override
    public void update(){
        
        String choice;
        
        System.out.println("\n---------------------------");
        System.out.println("Updating Prescription details: ");
        System.out.println("---------------------------");
        
        System.out.println("\nPrescription to update: ");
        
        System.out.println("\nPatient name: "+patient_name);
        System.out.println("Patient gender: "+patient_gender);
        System.out.println("Patient Disease: "+disease);
        
        System.out.println("\n---------------------------");
        System.out.println("Choose one option: ");
        System.out.println("---------------------------");
        
        System.out.println("\nPress 1 to update patient name");
        System.out.println("Press 2 to update patient gender");
        System.out.println("Press 3 to update patient disease");
        
        choice = sc1.nextLine();
        
        switch (choice) {
            case "1":
                System.out.print("\nEnter new patient name for the prescription: ");
                patient_name = sc1.nextLine();
                break;
            case "2":
                System.out.print("\nEnter new patient gender for the prescription: ");
                patient_gender = sc1.nextLine();
                break;
            case "3":
                System.out.print("\nEnter new patient disease for the prescription: ");
                disease = sc1.nextLine();
                break;
            default:
                System.out.println("\nPlease enter valid option");
                break;
        }
    }
    
    @Override
    public void show(){
        System.out.println("\n---------------------------");
        System.out.println("Prescription Details: ");
        System.out.println("---------------------------");
        System.out.println("\nPatient name: "+patient_name);
        System.out.println("Patient Gender: "+patient_gender);
        System.out.println("Patient Disease: "+disease);
    }
}

public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("---------------------------");
        System.out.println("Shahmir Ahmed (20-Arid-825)");
        System.out.println("---------------------------");
        
        // Medicine
        
        // Medicine object
        Medicine m = new Medicine();
        
        // Scanner object for aggregation
        Scanner sc1 = new Scanner(System.in);
        
        // creating new medicine
        m.create();
        
        // displaying medicine details
        m.show();
        
        // updating medicine
        m.update(sc1);
        
        System.out.println("\n---------------------------");
        System.out.println("Updated Prescription Details: ");
        System.out.println("---------------------------");
        
        // displaying medicine details
        m.show();
        
        // Staff
        
        // Staff object
        Staff s = new Staff();
        
        // setting staff details
        s.setName("Shahmir Ahmed");
        s.setAge(20);
        s.setDesignation("Pharmacist");
        s.setSalary(20000.0);
        
        // pritning staff details
        s.printDetails();
        
        // Prescription
        
        // Prescription object
        Prescription p = new Prescription();
        
        // Scanner class object for aggregation
        Scanner sc2 = new Scanner(System.in);
        
        // creating prescription
        p.create(sc2);
        
        // displaying specific prescription details
        p.show();
        
        // updating prescription details
        p.update();
        
        // displaying specific prescription details
        p.show();
        
    }
}
