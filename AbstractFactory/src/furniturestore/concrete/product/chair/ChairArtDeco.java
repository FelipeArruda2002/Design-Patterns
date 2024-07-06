package furniturestore.concrete.product.chair;

import furniturestore.abs.product.Chair;

public class ChairArtDeco implements Chair{

	@Override
	public boolean hasLegs() {
		return true;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on the artdeco chair");
	}

}
