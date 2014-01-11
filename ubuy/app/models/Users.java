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
@Table(name = "users")
public class Users extends Model
{
	@Id
	@OneToMany
	@Column(name = "user_id")
	public Long userId;

	@Column(name = "user_name")
	public String userName;

	@Column(name = "email")
	public String email;

	@Column(name = "password")
	public String password;
	
	// TODO: Is this required?
	public String toString()
	{
		return "Not implemented, sorry.";
	}

    public static Finder<Long, Users> finder = new Finder<Long, Users>(Long.class, Users.class);

}
