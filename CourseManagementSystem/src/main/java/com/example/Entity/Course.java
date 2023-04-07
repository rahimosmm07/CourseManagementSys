package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	@Id
	public int cid;
	public String cname;
	
@ManyToOne(cascade=CascadeType.ALL,fetch =FetchType.EAGER)
@JsonIgnoreProperties("course")
@JoinColumn(name="fid")


Faculty faculty;
	
	

}
