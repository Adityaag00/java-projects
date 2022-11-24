
public class NonSolarInverter extends Inverter{
	
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
