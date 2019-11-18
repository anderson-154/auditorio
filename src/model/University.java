package model;
import java.util.ArrayList;
import java.time.*;
import model.Auditorium;


public class University
{
	//atributos
	private String name;
	private String mss;
	private ArrayList<Auditorium>auditoriums;
	private ArrayList<Event> events;
	private Auditorium audiTemp;
	private Event eventTemp;
	
	//constructor
	/** mconstructor method
	*<p/>des</p>this method enter the name, an arrayList of auditorium, an arrayList of events 
	*@param the param  must be different of null  
	*@return no retorna
	*/	
	public University(String name, 	ArrayList<Auditorium>auditoriums, ArrayList<Event> events)
	{
		this.name=name;
		this.auditoriums = new ArrayList<Auditorium>();
		this.events = new ArrayList<Event>();
		this.eventTemp=eventTemp;
		this.audiTemp=audiTemp;
	}
	//metodo crear auditorio
	/** createAuditorium
	*<p/>des</p>this method created an auditorium in a arrayList of auditorium
	*@param the arrayList must be inicialized
	*@return an auditorium created
	*/		
	public String createAuditorium(String nameAuditorium, String location,int colMax,int chairRow, int []numberOfChair)
	{
		Auditorium newAuditorium = new Auditorium(nameAuditorium, location, colMax, chairRow);
		auditoriums.add(newAuditorium);
		auditoriums.get(auditoriums.size()-1).createChair(numberOfChair);
		
		return "the auditorium has been created";
	}
	//metodo crear evento
	/** createEvent
	*<p/>des</p>this method created an event in an arrayList of events
	*@param the arrayList must be inicialized
	*@return an events created
	*/	
	public String createEvent(String nameAuditorium, LocalDate date, LocalTime starTime, LocalTime endTime, String teacherName,String facultyName, int attendenceNumber)
	{
		
		Event newEvent = new Event(nameAuditorium, date, starTime, endTime, teacherName, facultyName, attendenceNumber);
		events.add(newEvent);
		
		return "the event has been created";
	}
	//metodo para ver sillas defectuosas en auditorio
	/** defectiveChairFromAudi
	*<p/>des</p> this method search between auditoriums and show the chairs defect
	*@param auditoriums !null and chairs !null
	*@return report of auditorium with chairs defect
	*/	
	public String defectiveChairFromAudi(String nameAuditorium, String description, int col, char charRow, String defect)
	{
		String reporte;
		for(int i=0;i<auditoriums.size();i++)
		{
			if(auditoriums.get(i).getNameAuditorium().equals(nameAuditorium))
			{
				reporte = auditoriums.get(i).reportChair();
			}
		}
		return reporte;		
	}
	//validacion nombre de auiditorios
	/** validationNameAudi
	*<p/>des</p>this method validates that dont exist an auditorium with equals name
	*@param auiditorios !null 
	*@return if exist an auditorium with equals name
	*/	
	public boolean validationNameAudi(String nameAuditorium)
	{
		boolean validation=false;
		String nameAudi;
		for(int i=0;i<auditoriums.size();i++)
		{
			nameAudi = auditoriums.get(i).getNameAuditorium();
			if(nameAudi.equals(nameAuditorium))
			{
				validation=true;
			}
		}
		return validation;
	}
}