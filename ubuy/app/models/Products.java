package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
@Table(name = "products")
public class Products extends Model
{
	@Id
	public Long product_id;

	@Column(nullable = false, columnDefinition = "VARCHAR(255)")
	public String image;

	@Column(nullable = false)
	public Long price;

	@Column(nullable = true, columnDefinition = "VARCHAR(255) DEFAULT NULL")
	public String categoly;

	@Column(nullable = true, columnDefinition = "VARCHAR(255) DEFAULT NULL")
	public String brand;

	@Column(nullable = false)
	public Long stock;

	@Column(nullable = false)
	public Long shop_id;

}
