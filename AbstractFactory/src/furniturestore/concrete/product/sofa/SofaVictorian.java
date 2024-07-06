package furniturestore.concrete.product.sofa;

import furniturestore.abs.product.Sofa;

public class SofaVictorian implements Sofa {
	
	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on the Victorian sofa");
	}

}
