package com.covid.restapi.covid19data.serviceinterface;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.covid.restapi.entity.CovidReport;

public interface Covid19DataService {

	public ResponseEntity<List<CovidReport>> getCovid19Data();
}
