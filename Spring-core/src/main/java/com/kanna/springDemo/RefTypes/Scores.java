package com.kanna.springDemo.RefTypes;

public class Scores {
	
  private int maths;
  private int physics;
  private int chemistry;

 
  
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	
	
	public int getCuttoff() {
		
		int math = this.maths/2;
		int phy  = this.physics/4;
		int che =  this.chemistry/4;
		
		return (math+phy+che); 
	}
	
	
	@Override
	public String toString() {
		return "Scores [maths=" + maths + ", physics=" + physics + ", chemistry=" + chemistry +  "]";
	}
	
	
	
	
}
