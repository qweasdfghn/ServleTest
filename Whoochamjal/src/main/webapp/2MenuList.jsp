<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>치킨 주문</title>
</head>
<body>
    <h1>주문하기</h1>
    <h3>주문하실 옵션들을 선택하신 후 아래 '주문완료' 버튼을 클릭해 주세요.</h3>


    <form action="/Menu2" method="get">
        <label>치킨 종류 선택  </label><br>
        <input type="radio" name="kind" id="nomal" value="후라이드치킨"><label for="nomal">후라이드치킨(+20,000원)</label>
        <input type="radio" name="kind" id="redsouce" value="양념치킨"><label for="redsouce">양념치킨(+21,000원)</label>
        <input type="radio" name="kind" id="blacksouce" value="간장치킨"><label for="blacksouce">간장치킨(+21,000원)</label>

        <br>
        <br>
        <br>


        <label>치킨 토핑 선택</label><br>

        <input type="checkbox" name="topping" id="Bburinklesouce" value="뿌링클소스"> <label for="Bburinklesouce">뿌링클소스(+1,000원)</label>
        <input type="checkbox" name="topping" id="Hotsouce" value="매운소스"> <label for="Hotsouce">핫소스(+1,000원)</label>
        <input type="checkbox" name="topping" id="Sotteok Sotteok" value="소떡소떡"> <label for="Sotteok Sotteok">소떡소떡(+3,000원)</label>
        <input type="checkbox" name="topping" id="kimroll" value="김말이"> <label for="kimroll">김말이(+1,000원)</label>
        <input type="checkbox" name="topping" id="notopping" value="선택 안 함"> <label for="notopping">선택 안 함(+0원)</label>

        <br>
        <br>
        <br>


        <label>리뷰 이벤트 하시는분 메뉴 선택 3중 택1 :</label><br>
        <input type="radio" name="reviewkind" id="coke" value="음료 추가"><label for="coke">음료 추가</label>
        <input type="radio" name="reviewkind" id="fry" value="튀김 3p"><label for="fry">튀김 3피스</label>
        <input type="radio" name="reviewkind" id="cheeseball" value="치즈볼"><label for="cheeseball">치즈볼</label>
        <br>
        <br>
        <br>
        <button type="submit">주문하기 </button>
    </form>
</body>
</html>
