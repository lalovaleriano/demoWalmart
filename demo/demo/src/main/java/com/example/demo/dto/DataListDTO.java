package com.example.demo.dto;

import java.io.Serializable;
import java.util.List;

public class DataListDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Integer> data;

	public List<Integer> getData() {
		return data;
	}

	public void setData(List<Integer> data) {
		this.data = data;
	}

}
