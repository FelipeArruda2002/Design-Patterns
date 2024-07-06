package furniturestore.concrete.product.coffetable;

import java.math.BigDecimal;

import furniturestore.abs.product.CoffeTable;

public class CoffeTableArtDeco implements CoffeTable {

	@Override
	public BigDecimal getWidth() {
		return new BigDecimal(2);
	}

	@Override
	public BigDecimal getLength() {
		return new BigDecimal(2.5);
	}

}
