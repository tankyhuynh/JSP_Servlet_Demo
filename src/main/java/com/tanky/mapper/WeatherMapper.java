package com.tanky.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tanky.model.WeatherModel;

public class WeatherMapper implements RowMapper<WeatherModel> {

	@Override
	public WeatherModel mapRow(ResultSet rs) {
		
		
		try {
			WeatherModel weatherModel = new WeatherModel();
			weatherModel.setId(rs.getInt("id"));
			weatherModel.setName(rs.getString("name"));
			weatherModel.setCod(rs.getInt("cod"));
			
			return weatherModel;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

}
