package orderhistory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderSnapshot implements Snapshot {

	private List<String> items;
	private String status;
	private LocalDate createdDate;

	public OrderSnapshot(List<String> items, String status, LocalDate createdDate) {
		this.items = new ArrayList<>(items);
		this.status = status;
		this.createdDate = createdDate;
	}

	public List<String> getItems() {
		return items;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String getSnapshotDetails() {
		return "Status: " + status + ", Items: " + items.toString();
	}

	@Override
	public LocalDate getCreateDate() {
		return createdDate;
	}

}
