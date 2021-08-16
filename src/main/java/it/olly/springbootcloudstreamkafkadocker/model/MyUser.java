package it.olly.springbootcloudstreamkafkadocker.model;

/**
 * Simple MyUser model
 * 
 * @author alessio olivieri
 *
 */
public class MyUser {
	public Long id;
	public String name;
	public String city;

	public MyUser() {
	}

	public MyUser(Long id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "MyUser{id=" + id + ", name=" + name + ", city=" + city + "}";
	}

}
