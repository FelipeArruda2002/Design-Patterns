package furniturestore.concrete.factory;

import furniturestore.abs.factory.FurnitureFactory;
import furniturestore.abs.product.Chair;
import furniturestore.abs.product.CoffeTable;
import furniturestore.abs.product.Sofa;
import furniturestore.concrete.product.chair.ChairModern;
import furniturestore.concrete.product.coffetable.CoffeTableModern;
import furniturestore.concrete.product.sofa.SofaModern;

public class ModernFactory implements FurnitureFactory{

	@Override
	public Chair createChair() {
		return new ChairModern();
	}

	@Override
	public CoffeTable createCoffeTable() {
		return new CoffeTableModern();
	}

	@Override
	public Sofa createSofa() {
		return new SofaModern();
	}

}
