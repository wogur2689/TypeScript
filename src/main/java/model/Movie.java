package model;

import java.util.Date;

//영화
public class Movie {
	private int id;				//기본키
	private String title;		//제목
	private String description; //설명
	private String posterUrl;	//포스터 url
	private int duration;		//상영시간(분)
	private Date releaseDate;	//개봉일
	
	public int getid() {
		return id;
	}
	public void setMovieId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPosterUrl() {
		return posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
}
