package com.squad.housepital.dto;

import lombok.Data;

@Data
public class DoctorSearchResponseDto {
	
	private Integer doctorId;
	private String doctorName;
	private Integer experience;
	private String email;
	private Double rating;
	private String specialization;
	private String imageUrl;
	private Long mobile;
	private Double consultationFee;

}
