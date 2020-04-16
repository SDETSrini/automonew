package com.qa.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class TestBase {
	
	protected static String filename;
	
	
	protected String getFileExtension(File file) {
		
		String extension = "";
		 
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }
 
        return extension;
 
    }
	
	public List<Map<String, String>> ReadDataFromCSVFile(String filepath) throws IOException, CsvException {

		List<Map<String, String>> CSVData = new ArrayList<Map<String, String>>();
		File file = new File(filepath);
		FileReader reader = new FileReader(file);
		CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
		List<String[]> alldata = csvReader.readAll();
		String[] allKeys = alldata.get(0);

		for (int i = 1; i < alldata.size(); i++) {

			Map<String, String> map = new HashMap<String, String>();
			String[] EachRow = alldata.get(i);

			for (int j = 0; j < EachRow.length; j++) {
				String key = allKeys[j].toLowerCase();
				String value = EachRow[j].isEmpty() ? "Not Exist in CSV" : EachRow[j];

				map.put(key, value);
			}
			CSVData.add(map);
		}
		return CSVData;
	}
	
	public static String GenerateStringFromResource(String path) throws IOException {

		return new String(Files.readAllBytes(Paths.get(path)));

	}
 

}
