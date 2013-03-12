package com.ruanko.gsontest;

import java.util.List;

@SuppressWarnings("serial")
public class CommonResult implements java.io.Serializable {

    private String shang;
    private Object data;
	public String getShang() {
		return shang;
	}
	public void setShang(String shang) {
		this.shang = shang;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
    
  
}