package com.bitrix.ai.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.github.javafaker.Faker;

@Service
public class UserService {
	
	public List<Faker> createFakeUsers()
	{
		List<Faker> fakerList = new ArrayList<>();
		
		for(int i=0;i<50;i++ )
		{
			Faker faker = new Faker();
			faker.name().firstName();
			faker.name().lastName();	
			
			fakerList.add(faker);
		}
		
	
		return fakerList;
	}
	
	public void insertFakeUsers(List<Faker> fakeUsers)
	{
		
		for(Faker fake : fakeUsers)
		{
			//UserModel.repository.save();
		}
		
	}
	
	public void getUsers()
	{
		String url = "https://b24-4g5ew2.bitrix24.com/crm/contact/list/";
		
		RestTemplate template = new RestTemplate();
		String users = template.getForObject(url, String.class);
		
		//convert the resulting string to user objects.
				
	}
	
	
	

}
