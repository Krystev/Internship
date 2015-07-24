package Chapter14;

import java.util.Date;

public class Ex13 {
	private static int count = 0;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Ex13.count = count;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	private Date date;

	private double duration;

	public Ex13(int duration) {

		this.setDate(new Date());
		this.setDuration(duration);
		count++;
	}

	public void callHistory() {

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getEndCall() {
		return duration;
	}

	public void setEndCall(int endCall) {
		this.duration = endCall;
	}

}
