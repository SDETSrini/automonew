package com.qa.base;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;


import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;


import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;

import net.masterthought.cucumber.ReportBuilder;

public class generateReport {

	public static void main(String[] args) throws IOException {
		
		String PATH_TO_SAVE = "reports/report_"
				+ (new Date(System.currentTimeMillis())).toString().replaceAll("[: ]", "_");
		File reportDir = new File(PATH_TO_SAVE);
		if (!reportDir.exists())
			FileUtils.forceMkdir(reportDir);

		// TODO Auto-generated method stub
		System.out.println("Generating local HTML reports for Cucumber");
		File reportOutputDirectory = new File("target");
		FileFilter fileFilter = new WildcardFileFilter("*.json");
		File[] files = reportOutputDirectory.listFiles(fileFilter);
		List<String> jsonFiles = new ArrayList<String>();
		for (File file : files) {
			jsonFiles.add(file.getAbsolutePath());
		}

		String buildNumber = System.getenv("BUILD_NUMBER") == null ? "1" : System.getenv("BUILD_NUMBER");
		String projectName = "Salsify";
//		boolean runWithJenkins = false;
//		boolean parallelTesting = false;

		// Modified below so the reports can be generated here
		reportOutputDirectory = new File(PATH_TO_SAVE);

		Configuration configuration = new Configuration(reportOutputDirectory, projectName);
		// optional configuration
//		configuration.setParallelTesting(parallelTesting);
//		configuration.setRunWithJenkins(runWithJenkins);
		configuration.setBuildNumber(buildNumber);
		// addidtional metadata presented on main page
		// configuration.addClassifications("Platform", "Windows");
		// configuration.addClassifications("Browser", "Firefox");
		// configuration.addClassifications("Branch", "release/1.0");

		// // optionally add metadata presented on main page via properties file
		// List<String> classificationFiles = new ArrayList<>();
		// classificationFiles.add("properties-1.properties");
		// classificationFiles.add("properties-2.properties");
		// configuration.addClassificationFiles(classificationFiles);

		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		Reportable result = reportBuilder.generateReports();
		// and here validate 'result' to decide what to do
		// if report has failed features, undefined steps etc

	
		
		
		

	}

}
