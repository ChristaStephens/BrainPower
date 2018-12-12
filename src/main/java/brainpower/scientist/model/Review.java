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
//reviews are strength ratings
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private Integer strength;
		
		//how we combined tables-get scientist from scientist table
		// updates scientist with new reviews
		@ManyToOne
		@JoinColumn(name = "scientist_id")
		private Scientist scientist;
		
		public Review() {
			
		} 
		 public Review(Integer strength, Scientist scientist) {
			 this.strength=strength;
			 this.scientist=scientist;
			 
		 }
		 
		 

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Integer getStrength() {
			return strength;
		}

		public void setStrength(Integer strength) {
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
