package ordermanagement;

public interface State {

	public void pay();

	public void cancel();

	public void ship();

	public void complete();
	
	public String getName();
	
}
