package furniturestore.concrete.product.chair;

import furniturestore.abs.product.Chair;

public class ChairModern implements Chair {

	@Override
	public boolean hasLegs() {
		return false;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on modern chair");
	}

}
