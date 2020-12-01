package com.tanky.DAO;

import java.util.List;

import com.tanky.model.WeatherModel;

public interface IWeatherDAO extends GenericDAO<WeatherModel> {

	List<WeatherModel> fillById(int Id);
	Long save(WeatherModel weatherModel);
	
}
