package brainpower.scientist.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scientists")
public class Scientist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private int year;
	private String image;
	private String name;
	private String country;
	private String rationale;
	private double strength;
	private String field;
	
	public Scientist() {}

	public Scientist(int year, String name, String image, String country, String rationale, String field) {
		super();
		this.year = year;
		this.name = name;
		this.image = image;
		this.country = country;
		this.rationale = rationale;
		this.field = field;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRationale() {
		return rationale;
	}

	public void setRationale(String rationale) {
		this.rationale = rationale;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}
	

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Scientist [id=" + id + ", year=" + year + ", name=" + name + ", image=" + image + ", country=" + country
				+ ", rationale=" + rationale + ", strength=" + strength + ", field=" + field + "]";
	}
	
	
	
	

}
