package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;


import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
@Table(name = "shops")
public class Shops extends Model
{
	@Id
	@OneToMany
	@Column(name = "shop_id")
	public Long shopId;

	@ManyToOne
	@JoinColumn(name = "user_id")
	public Users users;

	@Column(name = "tel_number")
	public String telNumber;

	@Column(name = "shop_name")
	public String shopName;

	@Column(name = "latitude")
	public Double latitude;

	@Column(name = "longitude")
	public Double longitude;

    public static Finder<Long, Shops> finder = new Finder<Long, Shops>(Long.class, Shops.class);
}
