/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitie;

import entitie.Enum.WorkerLevel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Joao Caetano
 */
public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(){  
    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Worker(String nomeFuncionario, String nivelFuncionario, double baseSalary, Department department) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the level
     */
    public WorkerLevel getLevel() {
        return level;
    }

    /**
     * @param level the level to set
     */
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    /**
     * @return the baseSalary
     */
    public Double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @param baseSalary the baseSalary to set
     */
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * @return the department
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(Department department) {
        this.department = department;
    }

    /**
     * @return the contracts
     */
    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1 + cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
            sum += c.totalValue();
            }
        }
        return sum;
    }
}
        
        
    
    
   

