<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>치킨 주문</title>
</head>
<body>
<h1>비회원 주문하기</h1>
<h3>주문자 이름, 전화번호, 주문자 주소를 작성해주신 후 '다음' 버튼을 클릭해주세요.</h3>

<form action="/Whoochamjal" method="post">
  <label><b>주문자 이름 : </b></label> <br>
  <input type="text" name="name">

  <br><br>
  <label><b> 비밀번호 : </b></label> <br>
  <input type="password" name="password">

  <br><br>
  <label><b>전화번호 : </b></label> <br>
  <input type="text" name="phoneNumber">

  <br><br>
  <label><b>주문자 주소 : </b></label> <br>
  <input type="text" name="address">





  <input type="submit" value="다음">
</form>


</body>
</html>
