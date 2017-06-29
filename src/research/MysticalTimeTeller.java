package research;

import java.io.Serializable;
import java.util.Calendar;

public class MysticalTimeTeller  extends Object implements Serializable, Cloneable, Comparable<Calendar> {
	public static void main(String[] args){
		Calendar current = Calendar.getInstance();
		current.setLenient(true);
		int dayofWeek = current.get(Calendar.DAY_OF_WEEK);
		int month = current.get(Calendar.MONTH)+1;
		int minute = current.get(Calendar.MINUTE);
		int hour = current.get(Calendar.HOUR);
		System.out.println("Day of Week:"+dayofWeek);
		System.out.println("Month:"+month);
		System.out.println("Time:"+hour+":"+minute);
		System.out.println(current);

	}

	@Override
	public int compareTo(Calendar o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
