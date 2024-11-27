package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Reservations;

public class ReservationDAO {
	private Connection conn;
	
	//영화 예매
    public boolean insertReservations(Reservations reservations) {
    	boolean isSuccess = false;
        String sql = "insert into booking(user_id, seat_number, reserved_at) values (?, ?, sysdate())";
        try {
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, reservations.getUserId());
        	pstmt.setString(2, reservations.getSeatNumber());
        	pstmt.executeUpdate();
        	
            isSuccess = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

    //영화 예매 수정
    public boolean updateReservations(Reservations reservations) {
    	boolean isSuccess = false;
        String sql = "update booking SET user_id = ?, seat_number = ?, reserved_at = sysdate() where id = ?";
        try {
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        	pstmt.setString(1, reservations.getUserId());
        	pstmt.setString(2, reservations.getSeatNumber());
        	pstmt.setInt(3, reservations.getId());
        	pstmt.executeUpdate();
        	
            isSuccess = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }

    //영화 예매 취소
    public boolean deleteReservations(int id) {
    	boolean isSuccess = false;
        String sql = "delete from booking where id = ?";
        try {
        	PreparedStatement pstmt = conn.prepareStatement(sql);
        	pstmt.setInt(1, id);
        	pstmt.executeUpdate();
        	
            isSuccess = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isSuccess;
    }
}
