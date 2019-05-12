/**
 * 
 */
package com.leo.eventapp;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * @author leonardo
 *
 */
@Configuration
public class DataConfiguration {

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName ("com.mysql.jdbc.Driver");
		dataSource.setDriverClassName ("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/eventsapp");
		dataSource.setUsername ("root");
		dataSource.setPassword ("");
		
		return dataSource;
		
	}
	
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		
		HibernateJpaVendorAdapter adapter = new	HibernateJpaVendorAdapter();
		adapter.setDatabase (Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl (true);
		// This dialect do not works for me
		// View link:
		// https://stackoverflow.com/questions/43407411/generationtarget-encountered-exception-accepting-command-error-executing-ddl-v
		// adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
		adapter.setPrepareConnection(true);
		
		return adapter;
	}
	
}
