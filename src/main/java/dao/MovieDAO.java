package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Movie;

public class MovieDAO {
	 private Connection conn;

	    public MovieDAO(Connection conn) {
	        this.conn = conn;
	    }

	    //영화 전체 조회
	    public ArrayList<Movie> getAllMovies() {
	        ArrayList<Movie> movies = new ArrayList<Movie>();
	        String sql = "SELECT * FROM Movies";
	        try {
	        	PreparedStatement pstmt = conn.prepareStatement(sql);
	            ResultSet rs = pstmt.executeQuery(); 
	            		
	            while (rs.next()) {
	                Movie movie = new Movie();
	                movie.setMovieId(rs.getInt("movie_id"));
	                movie.setTitle(rs.getString("title"));
	                movie.setDescription(rs.getString("description"));
	                movie.setPosterUrl(rs.getString("poster_url"));
	                movie.setDuration(rs.getInt("duration"));
	                movie.setReleaseDate(rs.getDate("release_date"));
	                movies.add(movie);
	            }
	            rs.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return movies;
	    }
	    
	    //영화 상세 조회
	    public Movie getMovie(int id) {
	    	Movie movie = new Movie();
	        String sql = "SELECT * FROM Movies WHERE id = ?";
	        try {
	        	PreparedStatement pstmt = conn.prepareStatement(sql);
	        	pstmt.setInt(1, id);
	            ResultSet rs = pstmt.executeQuery();
	            		
	            rs.next();
	            
	            movie.setMovieId(rs.getInt("movie_id"));
	            movie.setTitle(rs.getString("title"));
	            movie.setDescription(rs.getString("description"));
	            movie.setPosterUrl(rs.getString("poster_url"));
	            movie.setDuration(rs.getInt("duration"));
	            movie.setReleaseDate(rs.getDate("release_date"));
	            rs.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return movie;
	    }
}
