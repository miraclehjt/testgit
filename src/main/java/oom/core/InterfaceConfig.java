package oom.core;

import java.io.Serializable;

public class InterfaceConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7091202096532670128L;
	private String url;
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
}
