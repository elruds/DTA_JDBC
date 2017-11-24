
public class MyDate {

	private int day; 
	private int month;
	private int year;
	private int date;
	
public MyDate(int dd, int mm, int yy) { //constructor which takes three integers representing day, month and year
	
	day = dd;
	month = mm;
	year = yy;
}

public MyDate(int ddmmyy){ //constructor which takes one integer representing day, month and year
	
	date = ddmmyy;
	day = date / 10000;
	month = (date % 10000)/100;
    year = date % 100;
	if (year >= 0 && year <=20)	{
		year = (2000 + year) % 100;
	}
	else if (year >= 21 && year <=99) {
		year = (1900 + year) % 100;
	}
	
}

public int getDay() {

	return day;
	
}

public int getMonth() {
	
	return month;
}

public int getYear() {
	
	 return year;
}



}











