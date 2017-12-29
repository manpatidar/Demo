package collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetDemo {

	public enum WeekDay {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {

		EnumSet<WeekDay> weekDaySet = EnumSet.range(WeekDay.MONDAY, WeekDay.FRIDAY);

		EnumSet<WeekDay> weekEndSet = EnumSet.complementOf(weekDaySet);

		System.out.println("Usinf foreach loop");
		for (WeekDay day : weekDaySet) {
			System.out.println("Day :- " + day);
		}
		System.out.println("using iterator");
		Iterator itr = weekDaySet.iterator();
		while (itr.hasNext()) {
			System.out.println("Day - " + itr.next());
		}
		System.out.println("Need to work ? " + isWorkingDay(weekDaySet, WeekDay.MONDAY));
		System.out.println("Need to work ? " + isWorkingDay(weekDaySet, WeekDay.SATURDAY));
	}

	private static boolean isWorkingDay(Set<WeekDay> weekDaySet, WeekDay day) {
		// TODO Auto-generated method stub
		return weekDaySet.contains(day);
	}

}
