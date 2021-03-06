package brainpower.scientist.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


//creating a table
@Entity
@Table(name = "scientists")
public class Scientist {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "scientist_id")
	private Long id;
	private String year;
	private String image;
	private String name;
	private String country;
	private String rationale;
	private Double strength;
	private String field;
	@Column(name = "bio_link")
	private String bioLink;
	@Column(name = "alt_pro")
	private Boolean altPro;


	public Scientist() {}
	
	public Scientist(String year, String name, String image, String country, 
			String rationale, String field, String bioLink) {
		super();
		this.year = year;
		this.name = name;
		this.image = image;
		this.country = country;
		this.rationale = rationale;
		this.field = field;
		this.bioLink = bioLink;
	}
	//check for pronouns
	public Boolean getAltPro() {
		return altPro;
	}

	public void altPro(Boolean altPro) {
		this.altPro = altPro;
	}
	

	
	public Long getId() {
		return id;
	}

	public String getBioLink() {
		return bioLink;
	}

	public void setBioLink(String bioLink) {
		this.bioLink = bioLink;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
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

	public Double getStrength() {
		return strength;
	}

	public void setStrength(Double strength) {
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
