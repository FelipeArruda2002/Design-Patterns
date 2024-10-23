package requesthandler;

public class Request {
	
    private String type;
    private String data;

    public Request(String type, String data) {
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }
}

