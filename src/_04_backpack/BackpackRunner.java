package _04_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		new Backpack().packAndCheck();
	}


	
	public void putInBackpack(Pencil supply) {
		this.pencil = supply;
		log(supply);
	}

	public void putInBackpack(Ruler supply) {
		this.ruler = supply;
		log(supply);
	}

	public void putInBackpack(Textbook supply) {
		this.textbook = supply;
		log(supply);
	}

	private void log(Supply supply) {
		String description;
		if (supply == null) {
			description = "null";
		} else {
			description = supply.getClass().getSimpleName().toLowerCase();
		}

		System.out.println("You put " + description + " in your Backpack");
	}


	
}

