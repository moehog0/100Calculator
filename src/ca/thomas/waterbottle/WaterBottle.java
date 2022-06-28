package ca.thomas.waterbottle;

public class WaterBottle {

	public static void main(String[] args) {
		 new WaterBottle("Blue");
		 new WaterBottle("Red");
		 new WaterBottle("Orange");
		 new WaterBottle("Green");

		//System.out.println("Number of bottles: " + RegisterBottles.getBottleCount()); add bottle count print after the colors.
	}

	private final String color;

	public WaterBottle(String color) {
		this.color = color;
		RegisterBottles.addBottleCount();
		System.out.println("Color of bottle: " + getColor());
		System.out.println("Number of Bottles: " + RegisterBottles.getBottleCount());

	}

	public String getColor() {
		return this.color;
	}

	public String setColor(){
		return this.color;
	}


}
