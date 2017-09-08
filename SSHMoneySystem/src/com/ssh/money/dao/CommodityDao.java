package com.ssh.money.dao;

import java.util.List;

import com.ssh.money.domain.Commodity;

public interface CommodityDao {
	public void add(Commodity commodity);
	public void delete(String eid);
	public void save(Commodity commodity);
	public Commodity findByid(String eid);
	public List<Commodity> find(int begin, int pagesize);
	public Integer findCount();
	public void update();	
}
