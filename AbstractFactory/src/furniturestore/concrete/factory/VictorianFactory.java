package furniturestore.concrete.factory;

import furniturestore.abs.factory.FurnitureFactory;
import furniturestore.abs.product.Chair;
import furniturestore.abs.product.CoffeTable;
import furniturestore.abs.product.Sofa;
import furniturestore.concrete.product.chair.ChairVictorian;
import furniturestore.concrete.product.coffetable.CoffeTableVictorian;
import furniturestore.concrete.product.sofa.SofaVictorian;

public class VictorianFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ChairVictorian();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new CoffeTableVictorian();
	}

	@Override
	public Sofa createSofa() {
		return new SofaVictorian();
	}

}