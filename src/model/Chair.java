package model;

public class Chair
{
	//constantes
	public static final char DEFECTIVE='D';
	public static final char  OPERATIONAL='O';
	//atributos
	private char state;
	private boolean isEmpty;
	private String defect="";
	
	//constructor
	public Chair()
	{
		this.isEmpty=true;
		this.state=OPERATIONAL;
	}
	//getters and setters
	public char getState()
	{
		return state;
	}
	public void setDefect(String defect)
	{
		this.defect=defect;
	}
	public void setState(char state)
	{
		this.state=state;
	}
	public void setIsEmpty(boolean isEmpty)
	{
		this.isEmpty=isEmpty;
	}
	/**isAvailable
	*<p> des:</p> this method will validate if the chair is operational
	*@return this method returns if a chair is operational
	*/
	public boolean isAvailable()
	{
		boolean avaliable;
		avaliable=((""+state).equals(OPERATIONAL) && !isEmpty);
		
		return avaliable;
	}
}