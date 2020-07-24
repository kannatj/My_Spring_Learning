package com.kanna.springDemo.RefTypes;

public class Students {

	
	 private String name;
	 private Scores scores;
     private int Cutoff;
      
	 
	public void setCutoff() {
		this.Cutoff = scores.getCuttoff();
	}
	
	public int getCutoff() {
		return this.Cutoff;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Scores getScores() {
		return scores;
	}
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	
	
	@Override
	public String toString() {
		setCutoff();
		return "Students [name=" + name + ", scores=" + scores + ", OverAllCutOff ="+ Cutoff +"]";
	}
	
	
	 
	 
}
