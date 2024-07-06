package furniturestore.concrete.product.coffetable;

import java.math.BigDecimal;

import furniturestore.abs.product.CoffeTable;

public class CoffeTableModern implements CoffeTable {

	@Override
	public BigDecimal getWidth() {
		return new BigDecimal(1);
	}

	@Override
	public BigDecimal getLength() {
		return new BigDecimal(1.5);
	}

}
