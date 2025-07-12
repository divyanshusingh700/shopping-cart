package com.truecodes.inventory_service;

import com.truecodes.inventory_service.model.Inventory;
import com.truecodes.inventory_service.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}


	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setQuantity(100);
			inventory.setSkuCode("iphone-13");

			Inventory inventory1 = new Inventory();
			inventory1.setQuantity(20);
			inventory1.setSkuCode("iphone-13-red");

			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory);
		};
	}
}
