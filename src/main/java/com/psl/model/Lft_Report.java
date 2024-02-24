package com.psl.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Lft_Report {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int reportId;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "user_id", referencedColumnName = "id")
private User user;
private String reportName;
private double bilirubin;
private double SGOT;
private double SGPT;
private double alkalinePhosphate;
private double protein;
private double globulin;
private double A_G_Ratio;
private double GGTP;
public Lft_Report() {
	super();
	// TODO Auto-generated constructor stub
}
public Lft_Report(int reportId, User user, String reportName, double bilirubin, double sGOT, double sGPT,
		double alkalinePhosphate, double protein, double globulin, double a_G_Ratio, double gGTP) {
	super();
	this.reportId = reportId;
	this.user = user;
	this.reportName = reportName;
	this.bilirubin = bilirubin;
	SGOT = sGOT;
	SGPT = sGPT;
	this.alkalinePhosphate = alkalinePhosphate;
	this.protein = protein;
	this.globulin = globulin;
	A_G_Ratio = a_G_Ratio;
	GGTP = gGTP;
}
public int getReportId() {
	return reportId;
}
public void setReportId(int reportId) {
	this.reportId = reportId;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public String getReportName() {
	return reportName;
}
public void setReportName(String reportName) {
	this.reportName = reportName;
}
public double getBilirubin() {
	return bilirubin;
}
public void setBilirubin(double bilirubin) {
	this.bilirubin = bilirubin;
}
public double getSGOT() {
	return SGOT;
}
public void setSGOT(double sGOT) {
	SGOT = sGOT;
}
public double getSGPT() {
	return SGPT;
}
public void setSGPT(double sGPT) {
	SGPT = sGPT;
}
public double getAlkalinePhosphate() {
	return alkalinePhosphate;
}
public void setAlkalinePhosphate(double alkalinePhosphate) {
	this.alkalinePhosphate = alkalinePhosphate;
}
public double getProtein() {
	return protein;
}
public void setProtein(double protein) {
	this.protein = protein;
}
public double getGlobulin() {
	return globulin;
}
public void setGlobulin(double globulin) {
	this.globulin = globulin;
}
public double getA_G_Ratio() {
	return A_G_Ratio;
}
public void setA_G_Ratio(double a_G_Ratio) {
	A_G_Ratio = a_G_Ratio;
}
public double getGGTP() {
	return GGTP;
}
public void setGGTP(double gGTP) {
	GGTP = gGTP;
}
@Override
public String toString() {
	return "Lft_Report [reportId=" + reportId + ", user=" + user + ", reportName=" + reportName + ", bilirubin="
			+ bilirubin + ", SGOT=" + SGOT + ", SGPT=" + SGPT + ", alkalinePhosphate=" + alkalinePhosphate
			+ ", protein=" + protein + ", globulin=" + globulin + ", A_G_Ratio=" + A_G_Ratio + ", GGTP=" + GGTP + "]";
}

}
