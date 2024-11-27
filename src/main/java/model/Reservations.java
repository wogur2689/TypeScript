package model;

import java.time.LocalDateTime;
import java.util.Date;

//예매
public class Reservations {
	private int id;						//기본키
	private String userId;				//유저 id
	private String seatNumber; 			//좌석번호
	private LocalDateTime reservedAt;   //예약완료일시
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public LocalDateTime getReservedAt() {
		return reservedAt;
	}
	public void setReservedAt(LocalDateTime reservedAt) {
		this.reservedAt = reservedAt;
	}
}
