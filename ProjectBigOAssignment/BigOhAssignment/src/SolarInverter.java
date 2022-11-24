
public class SolarInverter extends Inverter{
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
