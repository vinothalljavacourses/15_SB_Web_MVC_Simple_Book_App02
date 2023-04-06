<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Home Page</title>
</head>
<body>
  <h3>Book Details</h3>
  
  <form action="bookview">
    Book Id : <input type="text" name="id"/>
              <input type="submit" value="Search"/>
   </form>
   <hr></hr>
   Book Id : ${book.bookId } <br/>
   Book Name : ${book.bookName } <br/>
   Book Price : ${book.bookPrice} <br/>
   
   SUPER
   
</body>
</html>