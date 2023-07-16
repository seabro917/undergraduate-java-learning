package PersonTest;

public class MyDate {
	protected int year;
	protected int month;
	protected int day;
	
	public MyDate(int year,int month,int day)
	{
		this.set(year, month, day);
	}
	
	public void set(int year,int month,int day) 
	{
		if(month<1||month>12)
			throw new MonthException(month+"月不在指定范围内！");
		if(day<1||day>MyDate.DaysofMonth(year, month))
			throw new DayException(day+"号不在指定月份的范围内！");
		this.year=year;
		this.month=month;
		this.day=day;
	}

	
	public static int DaysofMonth(int year,int month)
	{
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			return 31;
		case 2:
			return MyDate.isLeapYear(year) ? 28:29;
		case 4:case 6:case 9:case 11:
			return 30;
		default:
	        return 0;
		}
	}
	
	public static boolean isLeapYear(int year)
	{
		return year%400==0||year%100!=0&&year%4==0;
	}
	public String toString()
	{
		return year+"年"+month+"月"+day+"日";
	}
}
