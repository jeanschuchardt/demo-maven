package com.demo.maven.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Stock {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Getter @Setter
    private Long id;
	//@Getter @Setter
	private String name;
	//@Getter @Setter
    private int price;

	// public Long getId() {
	// 	return id;
	// }

	// public void setId(Long id) {
	// 	this.id = id;
	// }

	// public String getName() {
	// 	return name;
	// }

	// public void setName(String name) {
	// 	this.name = name;
	// }

	// public int getPrice() {
	// 	return price;
	// }

	// public void setPrice(int price) {
	// 	this.price = price;
	// }
}
