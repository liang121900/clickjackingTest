//package com.clickjacking.demo.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import com.fasterxml.jackson.databind.DeserializationFeature;
//import com.fasterxml.jackson.databind.ObjectMapper;
//@EnableWebMvc
//@Configuration
//public class MessageConfig {
//	@Bean
//	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
//	 MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
//	    ObjectMapper objectMapper = new ObjectMapper();
//	    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//	    jsonConverter.setObjectMapper(objectMapper);
//	 List<MediaType> myMediaTypes = new ArrayList<MediaType> ();
//     myMediaTypes.addAll (jsonConverter.getSupportedMediaTypes ());
//     myMediaTypes.add (new MediaType("application","csp-report"));
//     myMediaTypes.add (MediaType.parseMediaType ("application/csp-report;charset=UTF-8"));
//     jsonConverter.setSupportedMediaTypes (myMediaTypes);
//	 return jsonConverter;
//	}
//}
