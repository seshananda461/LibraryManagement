package com.Libabry.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Library")
public class Library {

	@Id
	private long library_id;
	private String library_address;
	public long getLibrary_id() {
		return library_id;
	}
	public void setLibrary_id(long library_id) {
		this.library_id = library_id;
	}
	public String getLibrary_address() {
		return library_address;
	}
	public void setLibrary_address(String library_address) {
		this.library_address = library_address;
	}
}
