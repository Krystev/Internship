package Chapter14;
public class Ex8_Battery {
	
	private String model;
	private byte durability;
	private int talkHours;
	
	 
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if(model != null) this.model = model;
	}
	public int getVoltage() {
		return talkHours;
	}
	public void setVoltage(int voltage) {
		this.talkHours = voltage;
	}
	public byte getDurability() {
		return durability;
	}
	public void setDurability(byte durability) {
		this.durability = durability;
	}
}
