package brainpower.scientist.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="bracket")
public class Bracket {

	//need to have table related to scientist
	//and related to ratings
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "bracket_id")
	private Long id;
	private String round1;
	private String round2;
	private String round3;
	private String champion;
	
	
	

	public Bracket () {}

	public Bracket(Long id, String round1, String round2, String round3, String champion) {
		super();
		this.id = id;
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.champion = champion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRound1() {
		return round1;
	}

	public void setRound1(String round1) {
		this.round1 = round1;
	}

	public String getRound2() {
		return round2;
	}

	public void setRound2(String round2) {
		this.round2 = round2;
	}

	public String getRound3() {
		return round3;
	}

	public void setRound3(String round3) {
		this.round3 = round3;
	}

	public String getChampion() {
		return champion;
	}

	public void setChampion(String champion) {
		this.champion = champion;
	}

	@Override
	public String toString() {
		return "Bracket [id=" + id + ", round1=" + round1 + ", round2=" + round2 + ", round3=" + round3 + ", champion="
				+ champion + "]";
	}
	
	
	}


