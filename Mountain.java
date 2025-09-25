package lab10;

public class Mountain {
	private String name;
	private int elevation;
	private double climbDifficulty;
	public Mountain(String n, int e, double cd) {name = n; elevation = e; climbDifficulty = cd;}
	public String getName() {return name;}
	public int getElevation() {return elevation;}
	public double getClimbDifficulty() {return climbDifficulty;}
	public void setName(String a) {name = a;}
	public void setElevation(int a) {elevation = a;}
	public void setClimbDifficulty(double a) {climbDifficulty = a;}
	public String toString() {return "Mountain{" + name + ", " + elevation + ", " + climbDifficulty + "}";
	}
}
