package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {
	@Id
	public int fid;
	public String fname;
	
@OneToMany(fetch =FetchType.EAGER,mappedBy ="faculty", cascade=CascadeType.ALL)


	
	List<Course> course;
}


