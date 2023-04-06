package com.vinothit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Books")
public class Book {
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double bookPrice;

}
