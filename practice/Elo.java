package me.maffew.practice;

public class Elo extends Player {

    public float MINIMUM_ELO = 700;
    public float DEFAULT_ELO = 1000;
	

	public void setDefaultELO() {
		return this.DEFAULT_ELO;
	}
	
	public void calculateELO(Player a, Player b) {
		int player1 = a.MySQL.getCurrentELO();
		int player2 = b.MySQL.getCurrentELO();
		
		
	}

}
