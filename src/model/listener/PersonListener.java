package model.listener;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;

import model.Person;

public class PersonListener {
	
	@PostPersist
	public void protokolliereEinfuegen (Person p) {
		System.out.println("Protokoll: Person mit id "+p.getId()+ " wurde eingefügt");
	}

	@PostUpdate
	public void protokolliereAktualisieren (Person p) {
		System.out.println("Protokoll: Person mit id "+p.getId()+ " wurde aktualisiert");
	}
	
	@PostRemove
	public void protokolliereLoeschen (Person p) {
		System.out.println("Protokoll: Person mit id "+p.getId()+ " wurde gelöscht");
	}
	
}
