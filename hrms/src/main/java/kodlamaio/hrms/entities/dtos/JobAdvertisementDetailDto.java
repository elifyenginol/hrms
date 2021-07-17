package kodlamaio.hrms.entities.dtos;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDetailDto {
	private String companyName;
	private String jobName;
	private String cityName;
	private int numberOfPosition;
	private Date createDate;
	private Date deadline;

}
