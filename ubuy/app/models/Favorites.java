package models;


import play.db.ebean.Model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.avaje.ebean.annotation.UpdatedTimestamp;

@Entity
@Table(name = "favorites")
public class Favorites extends Model
{
	@Id
	@Column(name = "favorite_id")
	public Long favoriteId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	public Long userId;

	@ManyToOne
	@JoinColumn(name = "product_id")
	public Long productId;
	
	// TODO: Is this required?
	public String toString()
	{
		return "Not implemented, sorry.";
	}

    public static Finder<Long, Favorites> finder = new Finder<Long, Favorites>(Long.class, Favorites.class);

}
