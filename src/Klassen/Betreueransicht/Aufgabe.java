package Klassen.Betreueransicht;

import java.util.Date;

public class Aufgabe {

	private Date datum;
	private String Student;
	private String Bezeichnung;
	private String Beschreibung;
	

	//Konstruktor
	public Aufgabe(Date datum, String student, String bezeichnung, String beschreibung) {
		super();
		this.datum = datum;
		Student = student;
		Bezeichnung = bezeichnung;
		Beschreibung = beschreibung;
	}
	
	public Aufgabe() {}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getStudent() {
		return Student;
	}

	public void setStudent(String student) {
		Student = student;
	}

	public String getBezeichnung() {
		return Bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		Bezeichnung = bezeichnung;
	}

	public String getBeschreibung() {
		return Beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		Beschreibung = beschreibung;
	}
}
