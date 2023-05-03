package lab6.library;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class library {
	
	@Id
	private long id;
	
	private String firstname;
	private String lastname;
	private String course;
	private String country;

	

}
