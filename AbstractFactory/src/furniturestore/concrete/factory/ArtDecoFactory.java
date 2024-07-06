package furniturestore.concrete.factory;

import furniturestore.abs.factory.FurnitureFactory;
import furniturestore.abs.product.Chair;
import furniturestore.abs.product.CoffeTable;
import furniturestore.abs.product.Sofa;
import furniturestore.concrete.product.chair.ChairArtDeco;
import furniturestore.concrete.product.coffetable.CoffeTableArtDeco;
import furniturestore.concrete.product.sofa.SofaArtDeco;

public class ArtDecoFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ChairArtDeco();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new CoffeTableArtDeco();
	}

	@Override
	public Sofa createSofa() {
		return new SofaArtDeco();
	}

}
