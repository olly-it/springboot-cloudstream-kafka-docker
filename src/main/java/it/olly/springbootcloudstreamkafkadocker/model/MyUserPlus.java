package it.olly.springbootcloudstreamkafkadocker.model;

/**
 * MyUserPlus model extending MyUser
 * 
 * @author alessio olivieri
 *
 */
public class MyUserPlus extends MyUser {
	public String info;

	public MyUserPlus() {
	}

	public MyUserPlus(Long id, String name, String city) {
		super(id, name, city);
	}

	public MyUserPlus(Long id, String name, String city, String info) {
		this(id, name, city);
		this.info = info;
	}

	@Override
	public String toString() {
		return "MyUserPlus{info=" + info + ", id=" + id + ", name=" + name + ", city=" + city + "}";
	}

}
