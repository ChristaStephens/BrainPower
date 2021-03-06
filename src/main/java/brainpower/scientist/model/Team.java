package brainpower.scientist.model;

import lombok.Data;

//bundles all of the get/set - a shortcut
//also includes hashcode and equals
@Data
public class Team {
	
	private Scientist scientist;
	private Integer strength;
	private Integer seed;
	
	
	public Team() {}

	// initialize the object of a class - we need all of these for the bracket
	public Team(Scientist scientist, Integer strength, Integer seed) {
		super();
		this.scientist = scientist;
		this.strength = strength;
		this.seed = seed;
	}


	public Scientist getScientist() {
		return scientist;
	}


	public void setScientist(Scientist scientist) {
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
