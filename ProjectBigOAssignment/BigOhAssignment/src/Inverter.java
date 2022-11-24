
public class Inverter {
	private int current;
	private int operating_voltage;
	private boolean isBatteryVersion;
	private String inverterID;
	
	public Inverter() {
	}	
	
	public Inverter(int current, int operating_voltage, boolean isBatteryVersion, String inverterID) {
		this.current = current;
		this.operating_voltage = operating_voltage;
		this.isBatteryVersion = isBatteryVersion;
		this.inverterID = inverterID;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getOperating_voltage() {
		return operating_voltage;
	}

	public void setOperating_voltage(int operating_voltage) {
		this.operating_voltage = operating_voltage;
	}

	public boolean isBatteryRequired() {
		return isBatteryVersion;
	}

	public void setBatteryVersion(boolean isBatteryVersion) {
		this.isBatteryVersion = isBatteryVersion;
	}

	public String getInverterID() {
		return inverterID;
	}

	public void setInverterID(String inverterID) {
		this.inverterID = inverterID;
	}

	public int getPowerRating() {
		return operating_voltage*current;
	}
}
