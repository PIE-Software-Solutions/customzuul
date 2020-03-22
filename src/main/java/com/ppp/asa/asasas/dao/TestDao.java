package com.ppp.asa.asasas.dao;

import static com.piesoftsol.oneservice.zuulservice.utils.CommonConstants.ONESERVICE_JDBC_TEMPLATE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TestDao {

	@Autowired
	@Qualifier(ONESERVICE_JDBC_TEMPLATE)
	private JdbcTemplate jdbcTemplate;
	
	public int getDualDao() {
		int y = jdbcTemplate.queryForObject("select 1 from dual", null, Integer.class);
		System.out.println("OOOOOOOOOOO :: "+y);
		return y;
	}
	
}
