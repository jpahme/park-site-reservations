package com.techelevator.campground.model;

public class Site {
	private Long siteId;
	private int campgroundId;
	private int siteNumber;
	private int maxOccupancy;
	private Boolean accessible;
	private int maxRvLength;
	private Boolean utilities;
	
	public Site(Long siteId, int campgroundId, int siteNumber, int maxOccupancy, Boolean accessible, int maxRvLength,
			Boolean utilities) {
		this.siteId = siteId;
		this.campgroundId = campgroundId;
		this.siteNumber = siteNumber;
		this.maxOccupancy = maxOccupancy;
		this.accessible = accessible;
		this.maxRvLength = maxRvLength;
		this.utilities = utilities;
	}
	public Long getSiteId() {
		return siteId;
	}
	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}
	public int getCampgroundId() {
		return campgroundId;
	}
	public void setCampgroundId(int campgroundId) {
		this.campgroundId = campgroundId;
	}
	public int getSiteNumber() {
		return siteNumber;
	}
	public void setSiteNumber(int siteNumber) {
		this.siteNumber = siteNumber;
	}
	public int getMaxOccupancy() {
		return maxOccupancy;
	}
	public void setMaxOccupancy(int maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}
	public Boolean getAccessible() {
		return accessible;
	}
	public void setAccessible(Boolean accessible) {
		this.accessible = accessible;
	}
	public int getMaxRvLength() {
		return maxRvLength;
	}
	public void setMaxRvLength(int maxRvLength) {
		this.maxRvLength = maxRvLength;
	}
	public Boolean getUtilities() {
		return utilities;
	}
	public void setUtilities(Boolean utilities) {
		this.utilities = utilities;
	}
	
	
}
