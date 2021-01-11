package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.repos.Event;
import com.demo.service.EventService;

@SpringBootApplication
public class Eventorganisation implements CommandLineRunner{

	@Autowired
	private EventService eventService;
	
	public static void main(String[] args) {
		SpringApplication.run(Eventorganisation.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
     SimpleDateFormat fmt=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=fmt.parse("15/01/2021");
		Date d2=fmt.parse("16/01/2021");
		Date d3=fmt.parse("17/07/2021");
		
		Event e1=new Event("Singing", "hyd", d1, 17, 20);
		Event e2=new Event("Dancing", "Chn", d2, 4, 10);
		Event e3=new Event("kitefestival", "bang", d3, 13, 15);
		
		eventService.addEvent(e1);
		eventService.addEvent(e2);
		eventService.addEvent(e3);
		
	}

}
