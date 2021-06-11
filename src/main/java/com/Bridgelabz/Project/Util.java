package com.Bridgelabz.Project;


	import java.io.File;
	import java.util.List;

	import com.Bridgelabz.Project.Stock;
	import com.fasterxml.jackson.core.type.TypeReference;
	import com.fasterxml.jackson.databind.DeserializationFeature;
    import com.fasterxml.jackson.databind.ObjectMapper;

	public class Util {
		public List<Stock> convertJsonObj(String filePath) {
			try {
				ObjectMapper objMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				File jsonFile = new File(filePath);	
				List<Stock> stockList = objMapper.readValue(jsonFile, new TypeReference<List<Stock>>(){});
				return stockList;
			}catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

		 

	}


