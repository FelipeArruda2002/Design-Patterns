package orderhistory;

import java.time.LocalDate;

public interface Snapshot {
	
	LocalDate getCreateDate();
	String getSnapshotDetails();

}
