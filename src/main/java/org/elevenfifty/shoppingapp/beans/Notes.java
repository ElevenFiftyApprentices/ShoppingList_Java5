package org.elevenfifty.shoppingapp.beans;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "notes")
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public int shoppingListItemID;
	public String body;
	public OffsetDateTime createdUtc;
	public OffsetDateTime modifiedUtc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getShoppingListItemID() {
		return shoppingListItemID;
	}
	public void setShoppingListItemID(int shoppingListItemID) {
		this.shoppingListItemID = shoppingListItemID;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
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
		Notes other = (Notes) obj;
		if (id != other.id)
			return false;
		return true;
	}	
}