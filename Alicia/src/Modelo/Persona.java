package Modelo;

public class Persona {
	 private int locura;
	 private int Secretos;
	 private int DondeseUbica;
	 private static int maximoLocura = 100;
	 
	 
	 public Persona (int nivelLocura,int DondeseUbica, int Secretos) {
		 this.locura = nivelLocura;
		 this.DondeseUbica = DondeseUbica;
		 this.Secretos = Secretos;
	 }
	 
	 public Persona() {
		 
	 }
	 
	public void Embellecer(int locuravariable) {
		locura += locuravariable;
			locuravariable++;
			Secretos -= 10;
	 }
	
	 public boolean estaenMaravilla() {
		 return DondeseUbica < 0;
	 
	 }
	 public boolean esNormal() {
		 if (locura < 10 && Secretos >= 500) {
			 return true;
		 
		 }
		 else {
			 return false;
		 }
	 }
	 public boolean esLindo() {
		 if(locura > (maximoLocura * 0.75) && estaenMaravilla()) {
			return true; 
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public int getLocura() {
		 return locura;
	 }
	 public void setLocura(int Locura) {
		 this.locura = Locura;
	 }
	 
	 public int getSecretos() {
		 return Secretos;
	 }
	 
	 public void setSecretos(int Secretos) {
		 this.Secretos = Secretos;
	 }
	 public int getDondeseUbica() {
		 return DondeseUbica;
	 }
	 
	 public void setDondeseUbica(int DondeseUbica) {
		 this.DondeseUbica = DondeseUbica;
	 }
	 public int getmaximoLocura() {
		 return maximoLocura;
	 }
	
}
