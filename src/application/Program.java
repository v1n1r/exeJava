package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
		System.out.print("Enter departament´s name: ");
		String departamentName = sc.next();
		System.out.print("Enter worker data: ");
		System.out.println("Name:");
		String workerName = sc.nextLine();
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary:");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,new Departament(departamentName));
			
		System.out.println("How many contracts to this worker?: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter contract #" + i + "data; " );
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = sc.nextInt();
		}
		
		sc.close();
			
		}
		
		
		
	}
	
	
	
	
	
}