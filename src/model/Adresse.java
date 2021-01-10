package model; 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String strasseHausnummer;
	
	private String plzOrt;
	
	@OneToOne
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getStrasseHausnummer() {
		return strasseHausnummer;
	}

	public void setStrasseHausnummer(String strasseHausnummer) {
		this.strasseHausnummer = strasseHausnummer;
	}

	public String getPlzOrt() {
		return plzOrt;
	}

	public void setPlzOrt(String plzOrt) {
		this.plzOrt = plzOrt;
	}
	
}
