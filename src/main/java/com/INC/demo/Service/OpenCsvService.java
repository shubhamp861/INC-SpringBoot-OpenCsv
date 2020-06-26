package com.INC.demo.Service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.INC.demo.Model.ModelInc;
import com.INC.demo.Repo.RepoOpenCsv;

@Service
public class OpenCsvService {
	
	@Autowired
	private RepoOpenCsv repo;
	
	String line;
	
	public void saveCsv() throws IOException
	{
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/file.csv")) ;
			while((line = bufferedReader.readLine())!=null) {
				String [] data = line.split(",");
				ModelInc modelInc = new ModelInc();
				modelInc.setId(data[0]);
				modelInc.setTitle(data[1]);
				modelInc.setDescription(data[2]);
				modelInc.setPublished(data[3]);
				repo.save(modelInc);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
