package com.INC.demo.Model;

import javax.persistence.Entity;

@Entity
public class ModelInc {
	
	@javax.persistence.Id
	private String Id;
	
	private String Title;
	
	private String Description;
	
	private String Published;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPublished() {
		return Published;
	}
	public void setPublished(String published) {
		this.Published = published;
	}
	@Override
	public String toString() {
		return "ModelInc [Id=" + Id + ", Title=" + Title + ", Description=" + Description + ", published=" + Published
				+ "]";
	}
	
	
	

}
