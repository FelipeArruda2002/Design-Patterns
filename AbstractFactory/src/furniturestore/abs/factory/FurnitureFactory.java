package furniturestore.abs.factory;

import furniturestore.abs.product.Chair;
import furniturestore.abs.product.CoffeTable;
import furniturestore.abs.product.Sofa;

/**
 * Abstract Factory
 */
public interface FurnitureFactory {
	
	Chair createChair();
	CoffeTable createCoffeTable();
	Sofa createSofa();

}
