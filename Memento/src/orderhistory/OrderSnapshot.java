package orderhistory;

import java.util.List;

public class OrderSnapshot {
	
    private List<String> items;
    private String status;

    public OrderSnapshot(List<String> items, String status) {
        this.items = items;
        this.status = status;
    }

    public String getSnapshotDetails() {
        return "Status: " + status + ", Items: " + items.toString();
    }
}

