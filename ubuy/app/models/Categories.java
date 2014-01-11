package models;


import play.db.ebean.Model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.OneToMany;

import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
@Table(name = "categories")
public class Categories extends Model
{
	@Id
	@OneToMany
	@Column(name = "category_id")
	public Long categoryId;

	@Column(name = "category")
	public String category;
	
	// TODO: Is this required?
	public String toString()
	{
		return "Not implemented, sorry.";
	}

    public static Finder<Long, Categories> finder = new Finder<Long, Categories>(Long.class, Categories.class);

}
