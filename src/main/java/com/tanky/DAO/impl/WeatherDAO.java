package com.tanky.DAO.impl;

import java.util.List;

import com.tanky.DAO.IWeatherDAO;
import com.tanky.mapper.WeatherMapper;
import com.tanky.model.WeatherModel;

public class WeatherDAO extends AbstractDAO<WeatherModel> implements IWeatherDAO {

	@Override
	public List<WeatherModel> fillById(int Id) {

		String sql = "select * from user where id = ?";
		
		
		return query(sql, new WeatherMapper(), Id);
	}

	@Override
	public Long save(WeatherModel weatherModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO weather (na, cod,");
		sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
		
		
		return insert(sql.toString(), weatherModel.getId(), weatherModel.getName(), weatherModel.getCod());
	}

}
