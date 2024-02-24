package com.psl.model;

public enum Role {
	PATIENT("PATIENT"),
	DOCTOR("DOCTOR");
 
	private String role;
 
	private Role(String role) {
		this.role = role;
	}
 
	@Override
	public String toString() {
		return this.role;
	}
}
