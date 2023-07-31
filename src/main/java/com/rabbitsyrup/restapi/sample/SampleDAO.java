package com.rabbitsyrup.restapi.sample;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface SampleDAO {
	List<Map<String, Object>> selectSample(Map<String, Object> map);
}