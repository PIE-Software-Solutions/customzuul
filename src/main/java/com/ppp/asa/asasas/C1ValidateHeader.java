package com.ppp.asa.asasas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.piesoftsol.oneservice.zuulservice.config.ValidateHeader;
import com.piesoftsol.oneservice.zuulservice.model.HeaderAuthModel;
import com.ppp.asa.asasas.dao.TestDao;

@Repository
@Component
@Configuration
public class C1ValidateHeader implements ValidateHeader{
	@Autowired
	protected TestDao testDao;
	
	@Override
	public boolean isHeaderValid(HeaderAuthModel principal, Object[] customAuthValues, JdbcTemplate jdbcTemplate) {
		
		int y = jdbcTemplate.queryForObject("select 1 from dual", null, Integer.class);
		System.out.println("LLLLL :: "+y);
		// TODO Auto-generated method stub
		/*for(int i = 0; i < principal.size(); i++) {
			
			System.out.println(" AAAAAAAAAAAAAAAA : "+customAuthValues[i].toString()+" === "+principal.get(i));
        	if (!customAuthValues[i].equals(principal.get(i)))
            {
        		System.out.println(" BBBBBBBBBBBBBB ");
                return false;
            }
        }*/
		System.out.println(" CCCC ");
		return true;
		//return ValidateHeader.super.isHeaderValid(principal, customAuthValues);
	}

	@Override
	public boolean isHeaderValid(HeaderAuthModel principal, Object[] customAuthValues) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
