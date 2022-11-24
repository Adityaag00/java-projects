
class iCruzeInverter extends NonSolarInverter{

}
class GTIInverter extends SolarInverter{

	public GTIInverter() {
		setBatteryVersion(false);
		setGridOnSystem(true);
	}
}

class Inverter {
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

public class Main {
	public static void main(String[] args) {
		PCUInverter pcuInverter = new PCUInverter();
		pcuInverter.setInverterID(""+1);
		System.out.println(pcuInverter);
	}
}

class NonSolarInverter extends Inverter{
	
	public NonSolarInverter() {
		setBatteryVersion(true);
	}

	@Override
	public String toString() {
		return "Current=" + getCurrent() + ", Operating_voltage=" + getOperating_voltage()
				+ ", BatteryRequired=" + isBatteryRequired() + ", InverterID=" + getInverterID()
				+ ", PowerRating=" + getPowerRating();
	}
	
}

class PCUInverter extends SolarInverter{

	public PCUInverter() {
		setBatteryVersion(true);
		setGridOnSystem(false);
	}
	
}

class RegaliaInverter extends SolarInverter{
	
	public RegaliaInverter() {
		
	}
}

class SolarInverter extends Inverter{
	private Object solarPanel;
	private boolean isGridOnSystem;
	
	public SolarInverter() {
		super();
		setSolarPanel("SOLARPANEL");
	}

	public SolarInverter(Object solarPanel, boolean isGridOnSystem) {
		super();
		this.solarPanel = solarPanel;
		this.isGridOnSystem = isGridOnSystem;
	}

	public Object getSolarPanel() {
		return solarPanel;
	}

	public void setSolarPanel(Object solarPanel) {
		this.solarPanel = solarPanel;
	}

	public boolean isGridOnSystem() {
		return isGridOnSystem;
	}

	public void setGridOnSystem(boolean isGridOnSystem) {
		this.isGridOnSystem = isGridOnSystem;
	}

	@Override
	public String toString() {
		return "solarPanel=" + solarPanel + ", isGridOnSystem=" + isGridOnSystem + ", Current="
				+ getCurrent() + ", Operating_voltage=" + getOperating_voltage() + ", isBatteryRequired="
				+ isBatteryRequired() + ", InverterID=" + getInverterID() + ", PowerRating="
				+ getPowerRating();
	}
	
	
}

class Zelio extends NonSolarInverter{

}
