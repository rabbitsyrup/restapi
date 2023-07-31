package com.rabbitsyrup.restapi.sample;

import lombok.Data;

//@Getter
//@Setter
@Data //@Getter, @Setter 및 toString, hashCode 등 다른 lombok annotation 다 합친 것
public class SampleVO {
	private String sample;
}