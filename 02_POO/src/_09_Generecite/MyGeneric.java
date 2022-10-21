package _09_Generecite;

/*
 * le concept de genericité peut s'appliquer à des classes, des méthodes et des interfaces identiques sur le plan algorithmique, mais qui manipule les tyes de données differentes
 * intérêt:
 * optimisation du code
 * moins de cast (transtypage)
 * 
 */

public class MyGeneric <T>{
	
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public MyGeneric(T data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyGeneric [data=" + data + "]";
	}
	
	//Méthode générique 
	
	boolean myEquals(MyGeneric <T> other) {
		
		return data.equals(other.data);
		
	}
	
	
	
	
	
	
	
	
	
	
}
