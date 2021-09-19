package org.travel.lodge.hotel.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Kanesh
 * Object relational Model mapping of Hotel entity
 */
@Entity
@Table(name="hotel")
public class Hotel {

	@Id
	@Column(name="hotelname")
	private String hotelname;

	@Column(name="rooms")
	private String rooms;

	@Column(name="rating")
	private String rating;

	@Column(name="price")
	private String price;

	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Hotel [hotelname=" + hotelname + ", rooms=" + rooms + ", rating=" + rating + ", price=" + price + "]";
	}




}
