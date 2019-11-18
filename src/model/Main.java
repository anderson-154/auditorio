package ui;
import java.util.Scanner; 
import model.University;
import model.Auditorium;
import java.time.*;

public class Main
{
	//atributos
	private static Scanner reader;
	private static Scanner options;
	private static University university;
	private static Auditorium auditorium;
	
	
	public static void main(String[] args)
	{
		reader = new Scanner(System.in);
		options = new Scanner(System.in);
		university = new University("icesi");
		String nameAuditorium;
		char statusAudi;
		String description;
		String defect;
		int option;
		int row;
		int col;
		int colMax;
		char charRow;
		int [] numberOfChair;	
		localDate date;
		LocalTime startTime;
		LocalTime endTime;
		String teacherName;
		String facultyName;
		int attendenceNumber;
		String report;
		String created;
		String porcentage;
		
			System.out.println("select the action you want to perform"+"\n 1.create auditorium"+"\n 2.report defective chair"+"\n 3. show chair status"+"\n 4.created event"+"\n 5.show events"+"\n 6. porcentage defective chairs");
			option = options.nextInt();
			
			switch(option)
			{
				case 1:
				System.out.println("enter the name of auditorium");
				nameAuditorium = reader.next();
				
				System.out.println("enter the auditorium status, where B is ocuped and F is free");
				statusAudi = reder.next().charAt();

				System.out.println("enter the numb of chairs for row");
				row = reader.nextInt();
				numberOfChair = new int[row];
				
				created =Auditorium.createAuditorium(nameAuditorium, location, colMax, chairRow);
				System.out.println(created);
				
				case 2:
				System.out.println("enter the columna and char row of chair");
				col = reader.nextInt();
				charRow = reader.next();
				System.out.println("enter name of auditorium");
				nameAuditorium = reader.next();
				
				charRow.charToInt(chairRow);
				
				report= university.reportChair(auditorium);
				
				System.out.println(report);
				break;
				
				case 3:
					System.out.println("enter the name of the auditorium for wich you want the report");
					auditorium = reader.next();
					
					reporte= university.defectiveChairFromAudi(auditorium);
					
					System.out.println(reporte);
					
				break;
				
				case 4:
				System.out.println("enter the name of auditorium");
				nameAuditorium = reader.next();
				System.out.println("enter the date of event");
				date = reader.next();
				System.out.println("enter the hour start event");
				startTime = reader.nextInt();
				System.out.println("enter the hour finish event");
				endTime = reader.next();
				System.out.println("enter the faculty in charge of event");
				facultyName = reader.next();
				System.out.println("enter the teacher in charge of event");
				teacherName = reader.next();
				System.out.println("enter the attendece number");
				attendenceNumber = reader.next();
				
				created = Auditorium.createEvent(nameAuditorium, date, starTime, endTime, teacherName, facultyName, attendenceNumber);
				System.out.println(created);
				break;
				
				case 5:
				show = Auditorium.showInfo();
				System.out.println(show);
				break;
				
				case 6:
				System.out.printl("enter the row of chairs");
				row = reader.nextInt();
				numberOfChair = new int[row];
				porcentage = Auditorium.calculatePorcentageDfectiveChair(auditorium);
				
				System.out.println(porcentage);
				
				break;
			}
	}
}