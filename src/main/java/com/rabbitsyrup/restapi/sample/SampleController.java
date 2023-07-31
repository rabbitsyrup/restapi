package com.rabbitsyrup.restapi.sample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {
	
	@Autowired
	private SampleService sampleService;
	
    @GetMapping("/get")
	public List<Map<String, Object>> get(@RequestParam(value = "sample", required = false) String sample) {
    	Map<String, Object> param = new HashMap<String, Object>();
    	param.put("sample", sample);
		return sampleService.selectSample(param);
	}
    
    @GetMapping("/simpleReturn")
    public SampleVO simpleReturn(SampleVO vo) {
    	return vo;
    }
}
