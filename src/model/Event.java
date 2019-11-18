package model;
import java.time.*;


public class Event 
{
	//atributos
	private String nameAuditorium;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;
	private String teacherName;
	private String facultyName;
	private int attendenceNumber;

	//constructor
	/** mconstructor method
	*<p/>des</p>enter date, start time, end time, teacher name, faculty name and attendence number of event
	*@param the param  must be different of null  
	*@return no retorna
	*/	
	public Event(String nameAuditorium, LocalDate date, LocalTime starTime, LocalTime endTime, String teacherName,String facultyName, int attendenceNumber)
	{
		this.nameAuditorium=nameAuditorium;
		this.date=date;
		this.startTime=startTime;
		this.endTime=endTime;
		this.teacherName=teacherName;
		this.facultyName=facultyName;
		this.attendenceNumber=attendenceNumber;
	}
	
	//getters and setters
	public String getNameAuditorium()
	{
		return nameAuditorium;
	}
	public LocalDate getDate()
	{
		return date;
	}
	public LocalTime getStarTime()
	{
		return startTime;
	}
	public LocalTime getEndTime()
	{
		return endTime;
	}
	public String getTeacherName()
	{
		return teacherName;
	}
	public String getFacultyName()
	{
		return facultyName;
	}
	public int getAttendenceNumber()
	{
		return attendenceNumber;
	}
	//metodo validatcion 
	
	/**validationEvents
	*<p> des:</p> this method will validate ifthe star time and end time are in requirements
	*@param this method has as param the local date, start time, end time 
	*@return this method return if validatiion is true or false 
	*/
	public static boolean validationEvents(LocalTime startTime, LocalTime endTime, LocalDate date)
	{
		boolean validation=true;
		
		if((endTime.getHour()- startTime.getHour())<2 || (endTime.getHour()-startTime.getHour())>2)
		{
			System.out.println("the duration of the event must be greater than 2 hours and less than 12");
			validation=false;
		}
			
		if((endTime.getHour()>8) || (startTime.getHour()<7))
		{
			System.out.println("the start time must be greater than 7 and the end time less than 8");
			validation=false;
		}
		return validation;
	}
	//metodo mostrar info evento
	/** showInfo
	*<p/>des</p> this method show all info of event
	*@param dont have param
	*@return the info of event
	*/	
	public String showInfo()
	{
		String infoEvent="";
		infoEvent=("\n Name event"+name+"\n name teacher in charge"+teacherName+"\n name faculty in charge"+facultyName+"number of people "+attendenceNumber);
		return infoEvent;
	}
	
}