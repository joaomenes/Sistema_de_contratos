/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import entitie.Department;
import entitie.Enum.WorkerLevel;
import entitie.HourContract;
import entitie.Worker;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Joao Caetano
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      
      System.out.print("Entre com o nome do departamento:");
      String departamentoNome = sc.nextLine();
      System.out.println("Entre com os dados do funcionário:");
      System.out.print("Nome:");
      String  nomeFuncionario = sc.nextLine();
      System.out.print("Nível:");
      String workerLevel = sc.nextLine();
      System.out.print("Salário base:");
      double baseSalary = sc.nextDouble();
      Worker worker = new Worker(nomeFuncionario, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentoNome));
      
      System.out.println("Quantos contrato esse funcionário tem?");
      int N = sc.nextInt();
      
      for(int i=1; i<=N; i++){
          System.out.println("Contrato :"+i);
          System.out.print("Data: ");
          Date contractDate = sdf.parse(sc.next());
          System.out.print("Valor por hora:");
          double valorPorHora = sc.nextDouble();
          System.out.println("Duração (horas:");
          int horas = sc.nextInt();
          HourContract contract = new HourContract(contractDate, valorPorHora, horas);
          worker.addContract(contract); //Isso faz o trabalhador ser associado ao contrato
      }
      
      System.out.println();
      System.out.println("Entre com mês e o ano para calcular o salário (MM/AA)");
      String mes_ano = sc.next();
      int mes = Integer.parseInt(mes_ano.substring(0,2));  //sempre informa 1 há mais no corte
      int ano = Integer.parseInt(mes_ano.substring(3));
      System.out.println("Nome: " + worker.getName());
      System.out.println("Departamento: " + worker.getDepartment().getName());
      System.out.println("Ganho no mês " + mes_ano + ":" + String.format("%.2f", worker.income(mes, ano)));
      
      sc.close();
    }
    
} 
