package Klassen;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args)	{
		
		//Start Programm
		ProgrammStart();
	}
	
	public static void ProgrammStart() {
		System.out.println("Wilkommen bei STUDO!");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("(1) Studentenansicht");
		System.out.println("(2) Betreueransicht");
		System.out.println("(3) Ausbilderansicht");
		
		int auswahl = chooseNumber();
		
		if (auswahl == -1)
		{
			//Fehler
		}
		else if(auswahl == 1)
		{
			ShowStudentenAnsicht();
		}
		else if(auswahl == 2)
		{
			ShowBetreuerAnsicht();
		}
		else if(auswahl == 3)
		{
			ShowAusbilderAnsicht();
		}

	}
	
	
	static void ShowStudentenAnsicht()
	{
		cls();
		System.out.println("Studentenansicht:");
	}
	
	static void ShowBetreuerAnsicht() {}
	
	static void ShowAusbilderAnsicht() {}
	
	//Leere Bildschirm
	static void cls() {
		for(int i =  0 ; i!= 50; i++)
		{
			System.out.println("");
		}
	}
	
	
	//Konsole auslesen und eingegebene Nummer zurückgeben
	static int chooseNumber()
	{
		System.out.println("Nummer für gewünschtes Menu eingeben und mit [Enter] bestätigen.");
		
		//Konsoleneingabe
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String Auswahl = "-1";
		
		//Lese Nutzereingabe
		try {
			//lesen
			Auswahl = reader.readLine();
			return Integer.parseInt(Auswahl);
		} 
		catch (Exception ex) {}
		
		
		//Fehler
		return -1;
	}
}
