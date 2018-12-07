package brainpower.scientist.model;

import lombok.Data;

@Data
public class Team {
	
	private String scientist;
	private Integer strength;
	private Integer seed;
	
	
	public Team() {}


	public Team(String scientist, Integer strength, Integer seed) {
		super();
		this.scientist = scientist;
		this.strength = strength;
		this.seed = seed;
	}


	public String getScientist() {
		return scientist;
	}


	public void setScientist(String scientist) {
		this.scientist = scientist;
	}


	public Integer getStrength() {
		return strength;
	}


	public void setStrength(Integer strength) {
		this.strength = strength;
	}


	public Integer getSeed() {
		return seed;
	}


	public void setSeed(Integer seed) {
		this.seed = seed;
	}


	@Override
	public String toString() {
		return "Team [scientist=" + scientist + ", strength=" + strength + ", seed=" + seed + "]";
	}
	
	
}
