package construction.singleton.registry;

public abstract class Factory {
	
	public void name() {
		System.out.println(this.getClass().getSimpleName());
	}
}
