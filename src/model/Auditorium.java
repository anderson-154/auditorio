package model;
import java.util.ArrayList;


public class Auditorium
{
	//atributos
	private String nameAuditorium;
	private String location;
	private Chair[][] chairs;
	
	//metodo constructor
	/** mconstructor method
	*<p/>des</p>this method enter name auditorium, location , arrangement of chairs, column max of chairs, and char Row 
	*@param the param  must be different of null  
	*@return no retorna
	*/	
	public Auditorium(String nameAuditorium, String location, Chair[][] chairs,int colMax, char charRow)
	{
		this.nameAuditorium=nameAuditorium;
		this.location=location;
		this.chairs = new Chair[charRow][colMax];
	}
	public String getNameAuditorium()
	{
		return nameAuditorium;
	}
	//metodo crear sillas
	/** createChair
	*<p/>des</p> arrangement of numberOfChair
	*@param the numberOfChair must be initialized
	*@return a quantity of chairs 
	*/	
	public String createChair(int []numberOfChair)
	{	
		for(int i=0;i<chairs.length;i++)
		{
			for(int j=0;j<numberOfChair.length;j++)
			{
				chairs[i][j]= new Chair();
			}
		}
		return "the chairs has been created";
	}
	
	//metodo reportar silla 
	/** reportChair
	*<p/>des</p>this method will reported if a chair has a defect
	*@param columns, char row, the cause is defect
	*@return a message if tha chairs was created
	*/	
	public String reportChair(int col, char charRow, String defect)
	{
		int intRow=charToInt(charRow);
		chairs[intRow-1][col].setState(Chair.DEFECTIVE);
		chairs[intRow-1][col].setDefect(defect);
		return "the chair has been reported";
	}
	
	//metodo cambiar char to int
	/** charToInt
	*<p/>des</p>this method convert a char to int
	*@param a charRow
	*@return the numb of the char
	*/	
	public int charToInt(char charRow)
	{
		int row=-1;
		String[] alphabet= {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","W","X","Y","Z"};
		for(int i=0;i<alphabet.length;i++)
		{
			if((""+charRow).equals(alphabet[i]))
			{
				row=i;
			}
		}
		return row;
	}
	
	//metodo calcular porcentaje de sillas defectuosas
	/**calculatePorcentageDfectiveChair
	*<p/>des</p> this method calculate the number of chairs defective and the total of charis
	*@param arrangement of charis 
	*@return the numb of charis dfective and total chairs
	*/	
	public double calculatePorcentageDfectiveChair(int []numberOfChair)
	{
		int defectiveChair=0;
		int totalChair=0;
		double porcentage=0;
		for(int i=0;i<chairs.length;i++)
		{
			for(int j=0;j<numberOfChair.length;j++)
			{
				if(chairs[i][j].equals(Chair.DEFECTIVE))
				{
					defectiveChair++;
				}
				totalChair++;
			}
		}
		porcentage=((defectiveChair/totalChair)*100);
		return porcentage;
	}
}