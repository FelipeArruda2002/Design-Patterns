package furniturestore.concrete.product.sofa;

import furniturestore.abs.product.Sofa;

public class SofaModern implements Sofa{

	@Override
	public boolean hasLegs() {
		return false;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on sofa chair");
	}

}
