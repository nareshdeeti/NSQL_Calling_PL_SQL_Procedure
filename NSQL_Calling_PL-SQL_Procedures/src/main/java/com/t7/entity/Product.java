package com.t7.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable {
	private int pid;
	private String pname;
	private float price;
	private int qty;
	private boolean status;
}
