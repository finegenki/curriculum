package check;

import constants.Constants;

public class Main {
	private String firstName = "八田";
	private String lastName = "元気";
	private void printName() {
		System.out.println("printNameメソッド → "+this.firstName + this.lastName);
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Main m = new Main();
	m.printName();
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	pet.introduce();
	robotPet.introduce();
	}
	
	
}
