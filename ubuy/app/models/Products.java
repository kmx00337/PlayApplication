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
@Table(name = "products")
public class Products extends Model
{
	@Id
	@OneToMany
	@Column(name = "product_id")
	public Long productId;

	@ManyToOne
	@JoinColumn(name = "category_id")
	public Categories categories;

	@ManyToOne
	@JoinColumn(name = "shop_id")
	public Shops shops;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Users users;

	@Column(name = "image_path")
	public String imagePath;

    @Column(name = "promo_word")
    public String promoWord;

	@Column(name = "price")
	public Long price;

	@Column(name = "brand")
	public String brand;

	@Column(name = "stock")
	public Long stock;

    public static Finder<Long, Products> finder = new Finder<Long, Products>(Long.class, Products.class);
}

