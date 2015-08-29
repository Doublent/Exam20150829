package com.hand;

import javax.sql.DataSource;
public interface FilmDAD {
   
   public void setDataSource(DataSource ds);
   
   public void insert(String title,String description, Integer language_id);
   
}