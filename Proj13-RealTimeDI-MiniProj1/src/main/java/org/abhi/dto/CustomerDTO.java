package org.abhi.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDTO implements Serializable {
	private String cname;
	private String cadd;
	private float pamt;
	private float rate;
	private float time;
}
