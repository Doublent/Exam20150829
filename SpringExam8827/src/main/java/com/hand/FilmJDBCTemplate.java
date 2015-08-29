package com.hand;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.annotation.*;

//@Qualifier("filmJDBCTemplate")
public class FilmJDBCTemplate implements FilmDAD {
	
	@SuppressWarnings("restriction")
	@PostConstruct
	   public void init(){
	      System.out.println("Context Start");
	   }
	@SuppressWarnings("restriction")
	@PreDestroy
	   public void destroy(){
	      System.out.println("Context Stop");
	   }

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);

	}

	public void insert(String title,String description, Integer language_id){
		String SQL = "insert into film (title, description, language_id) values (?, ?, ?)";     
		jdbcTemplateObject.update( SQL, title, description, language_id);

	}




}
