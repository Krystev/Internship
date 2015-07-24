package Chapter14;

import java.util.ArrayList;

public class Ex8_To_Ex16 {

	public static Ex8_To_Ex16 nokiaN95 = new Ex8_To_Ex16("nokia", new Ex8_Display(
			4, 5, 16000000));

	private ArrayList<Ex13> callHistory = new ArrayList<>();
	private String brand;
	private String owner;
	private int price;
	private Ex8_Battery battery;
	private Ex8_Display display;

	public ArrayList<Ex13> getCallHistory() {
		return callHistory;
	}

	public void setCallHistory(ArrayList<Ex13> callHistory) {
		this.callHistory = callHistory;
	}

	public Ex8_To_Ex16(String newBrand, Ex8_Display display) {
		this.setBrand(newBrand);
		this.setBattery(null);
		this.setDisplay(display);
	}

	public static void nokiaN95Info() {
		System.out.println(nokiaN95.getBrand() + " " + nokiaN95.getBattery()
				+ " " + nokiaN95.getDisplay().getDisplaySize());
	}

	public double callPrice(double price) {
		int callNumbers = 0;
		for (int i = 0; i < callHistory.size(); i++) {
			callNumbers += callHistory.get(i).getDuration();
		}
		return callNumbers * price;
	}

	public void addCall() {
		callHistory.add(new Ex13(1));
	}

	public void removeCall(Ex13 call) {
		callHistory.remove(call);
	}

	public void removeAll() {
		callHistory.clear();
	}

	public void call() {
		System.out.println("calling...");
		addCall();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Ex8_Display getDisplay() {
		return display;
	}

	public void setDisplay(Ex8_Display display) {
		this.display = display;
	}

	public Ex8_Battery getBattery() {
		return battery;
	}

	public void setBattery(Ex8_Battery battery) {
		this.battery = battery;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
