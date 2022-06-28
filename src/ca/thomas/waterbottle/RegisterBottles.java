package ca.thomas.waterbottle;

public class RegisterBottles {

	private static int bottlecount;


	public static void addBottleCount(){
		bottlecount++;
	}



	public static int getBottleCount() {
		return bottlecount;
	}

	public static void setBottleCount(int bottlecount) {
		RegisterBottles.bottlecount = bottlecount;
	}


	}

