public class ClockTime {
    private int hour;
    private int minute;
    private String amPm;
    public ClockTime(int h, int m, String ap) {
        hour = h;
        minute = m;
        amPm = ap;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
   public String getAmPm() {
        return amPm;
    }
    public String toString() {
        return String.format("%d:%02d %s", hour, minute, amPm);
    }
    public void advance(int minutes) {
        int totalMinutes = hour * 60 + minute + minutes;
        int hoursElapsed = totalMinutes / 60;
        minute = totalMinutes % 60;
        int totalHours = hoursElapsed % 12;
        hour = totalHours == 0 ? 12 : totalHours;

        int amPmChanges = hoursElapsed / 12;
        if (amPmChanges % 2 == 1) {
            amPm = amPm.equals("AM") ? "PM" : "AM";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ClockTime time = new ClockTime(6, 27, "PM");

        time.advance(1);
        System.out.println(time); // 6:28 PM

        time.advance(30);
        System.out.println(time); // 6:58 PM

        time.advance(5);
        System.out.println(time); // 7:03 PM

        time.advance(60);
        System.out.println(time); // 8:03 PM

        time.advance(128);
        System.out.println(time); // 10:11 PM

        time.advance(180);
        System.out.println(time); // 1:11 AM

        time.advance(1440);
        System.out.println(time); // 1:11 AM (1 day later)

        time.advance(21075);
        System.out.println(time); // 4:26 PM (2 weeks later)
    }
}

