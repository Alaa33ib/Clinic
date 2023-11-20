public class Appointment{

	private int Apptid;
	private String Time;
	private String Date;

	public Appointment(int id,String time, String date){
		Apptid = id;
		Time = time;
		Date = date;
	}

	public void setID(int id){
		Apptid = id;
	}

	public void setTime(String time){
		Time = time;
	}

	public void setDate(String date){
		Date = date;
	}

	public int getID(){
		return Apptid;
	}

	public String getTime(){
		return Time;
	}

	public String getDate(){
		return Date;
	}

}