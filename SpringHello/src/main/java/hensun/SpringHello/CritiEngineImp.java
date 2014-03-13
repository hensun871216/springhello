package hensun.SpringHello;

public class CritiEngineImp implements CritiEngine {
	private String pool[];

	public CritiEngineImp() {
	}

	public String getCriti() {
		int i = (int) (Math.random() * pool.length);
		return pool[i];
	}

	public void setPool(String[] pool) {
		this.pool = pool;
	}
	
}
