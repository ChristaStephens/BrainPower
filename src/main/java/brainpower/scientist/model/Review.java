package brainpower.scientist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class Review {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private Double strength;
		
		@ManyToOne
		@JoinColumn(name = "scientist_id")
		private Scientist scientist;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Double getStrength() {
			return strength;
		}

		public void setStrength(Double strength) {
			this.strength = strength;
		}

		public Scientist getScientist() {
			return scientist;
		}

		public void setScientist(Scientist scientist) {
			this.scientist = scientist;
		}

		@Override
		public String toString() {
			return "Review [id=" + id + ", strength=" + strength + ", scientist=" + scientist + "]";
		}
		
		

}
