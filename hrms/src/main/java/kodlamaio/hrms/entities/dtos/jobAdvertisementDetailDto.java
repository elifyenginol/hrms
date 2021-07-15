package kodlamaio.hrms.entities.dtos;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class jobAdvertisementDetailDto {
	private String companyName;
	private String jobDescription;
	private int needEmployeeNumber;
	private Date createDate;
	private Date lastAplyDate;

}
