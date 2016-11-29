package org.elevenfifty.shoppingapp.beans;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lists")
public class Lists {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public int userId;
	public String name;
	public String color;
	public OffsetDateTime createdUtc;
	public OffsetDateTime modifiedUtc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public OffsetDateTime getCreatedUtc() {
		return createdUtc;
	}
	public void setCreatedUtc(OffsetDateTime createdUtc) {
		this.createdUtc = createdUtc;
	}
	public OffsetDateTime getModifiedUtc() {
		return modifiedUtc;
	}
	public void setModifiedUtc(OffsetDateTime modifiedUtc) {
		this.modifiedUtc = modifiedUtc;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lists other = (Lists) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}