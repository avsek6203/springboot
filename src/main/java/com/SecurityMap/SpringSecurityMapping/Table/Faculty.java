package com.SecurityMap.SpringSecurityMapping.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty")
@SecondaryTable(name = "course", pkJoinColumns = @PrimaryKeyJoinColumn(name = "faculty_id"))
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   @Column(name="FacName")
    private String FacName;
   @Column(name="FacDept")
    private String FacDept;

 
    @Column(name="courseTitlet",table = "course")
    private String courseTitle;

    @Column(name="courseCredits",table = "course")
    private int courseCredits;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFacName() {
		return FacName;
	}

	public void setFacName(String facName) {
		FacName = facName;
	}

	public String getFacDept() {
		return FacDept;
	}

	public void setFacDept(String facDept) {
		FacDept = facDept;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getCourseCredits() {
		return courseCredits;
	}

	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}

  

    
}