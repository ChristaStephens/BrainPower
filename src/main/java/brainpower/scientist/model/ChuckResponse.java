package brainpower.scientist.model;

public class ChuckResponse {
	
	
	private String id;
	private String value;
	
	public ChuckResponse() {
		super();
		
	}

	public ChuckResponse(String id, String value) {
		super();
		this.id = id;
		this.value = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ChuckResponse [id=" + id + ", value=" + value + "]";
	}
	
	
}
