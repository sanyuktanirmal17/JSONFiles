package com.Bridgelabz.Project;

import java.util.List;

public class Inventory {
	
	private List<Wheat> Wheat;
	private List<Pulses> Pulses;
	private List<Rice> Rice;
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Wheat> getWheats() {
		return Wheat;
	}

	public void setWheats(List<Wheat> wheat) {
		Wheat = wheat;
	}

	public List<Pulses> getPulses() {
		return Pulses;
	}

	public void setPulses(List<Pulses> pulses) {
		Pulses = pulses;
	}

	public List<Rice> getRice() {
		return Rice;
	}

	public void setRice(List<Rice> rice) {
		Rice = rice;
	}

}
