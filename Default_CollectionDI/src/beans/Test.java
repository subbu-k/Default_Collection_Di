package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	private List fruits;
	private Set cricketers;
	private Map CountryCap;
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCountryCap() {
		return CountryCap;
	}
	public void setCountryCap(Map countryCap) {
		CountryCap = countryCap;
	}
	
	public void printData() {
		System.out.println("----------------");
		for(Object fruit:fruits) {
			System.out.println(fruit);
					}
	
		System.out.println("-----------------");
		for(Object cir:cricketers) {
			System.out.println(cir);
		}
		System.out.println("-----------------");
		Set keys=CountryCap.keySet();
		for(Object cc:keys) {
			System.out.println("Country = "+cc+"Capital:"+CountryCap.get(cc));
		}
		
		
	}
	
}
