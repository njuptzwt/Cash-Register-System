package com.ssh.money.service;

import com.ssh.money.domain.Commodity;
import com.ssh.money.domain.PageBean;

public interface CommodityService {
		public void add(Commodity commodity);
		public void save(Commodity commodity);
		public void update();
		public PageBean<Commodity> findAll(int curpage);
		public Commodity findByid(String eid);
		public void delete(String eid);
}
