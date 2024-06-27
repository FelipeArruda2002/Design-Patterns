package types.graphs;

import java.util.ArrayList;
import java.util.List;

public abstract class Chart {

	private List<Integer> data;
	
	protected List<Integer> getData() {
		return data;
	}
	
	public void addData(List<Integer> data) {
		if (this.data == null) {
			this.data = new ArrayList<Integer>();
		}
		this.data = data;
	}
	
	public abstract void render();
	
}
