package com.rabbitsyrup.restapi.sample;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	private SampleDAO sampleDAO;
	
    public List<Map<String, Object>> selectSample(Map<String, Object> map) {
        return sampleDAO.selectSample(map);
    }
}