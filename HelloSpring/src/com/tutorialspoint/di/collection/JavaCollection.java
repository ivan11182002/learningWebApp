package com.tutorialspoint.di.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	private List addrList;
	private Set addrSet;
	private Map addrMap;
	private Properties addrProp;
	
	
	public List getAddrList() {
		System.out.println("List: " + addrList);
		return addrList;
	}
	public void setAddrList(List addrList) {
		this.addrList = addrList;
	}
	public Set getAddrSet() {
		System.out.println("Set: " + addrSet);
		return addrSet;
	}
	public void setAddrSet(Set addrSet) {
		this.addrSet = addrSet;
	}
	public Map getAddrMap() {
		System.out.println("Map: " + addrMap);
		return addrMap;
	}
	public void setAddrMap(Map addrMap) {
		this.addrMap = addrMap;
	}
	public Properties getAddrProp() {
		System.out.println("Properties: " + addrProp);
		return addrProp;
	}
	public void setAddrProp(Properties addrProp) {
		this.addrProp = addrProp;
	}
}
