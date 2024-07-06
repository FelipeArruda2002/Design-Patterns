package furniturestore.concrete.product.sofa;

import furniturestore.abs.product.Sofa;

public class SofaArtDeco implements Sofa {
	
	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on the artdeco sofa");
	}

}
