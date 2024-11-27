<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="dao.MovieDAO, java.util.ArrayList, model.Movie" %>
<%
    MovieDAO movieDAO = new MovieDAO((Connection) application.getAttribute("DBConnection"));
    ArrayList<Movie> movies = movieDAO.getAllMovies();
%>
<!DOCTYPE html>
<html>
<head>
    <title>영화 목록</title>
    <link rel="stylesheet" href="css/styles.css">
</head>
<body>
    <h1>Available Movies</h1>
    <ul>
        <% for (Movie movie : movies) { %>
            <li>
                <img src="<%= movie.getPosterUrl() %>" alt="<%= movie.getTitle() %>" width="100">
                <h3><%= movie.getTitle() %></h3>
                <p><%= movie.getDescription() %></p>
                <p>Duration: <%= movie.getDuration() %> mins</p>
                <a href="booking.jsp?movieId=<%= movie.getMovieId() %>">Book Now</a>
            </li>
        <% } %>
    </ul>
</body>
</html>