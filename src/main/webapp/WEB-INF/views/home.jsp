<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CQRS 테스트</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
    <script src="http://code.jquery.com/jquery-3.1.1.js"></script>
</head>
<body>
<div class="container">
    <div id="board" class="bg-secondary">
        <c:forEach var="boardInfo" items="${masterBoardDateList}" begin="0" end="${fn:length(masterBoardDateList)}" step = "1" varStatus="status">
                <p class = "commentPara">timeSeq : ${boardInfo.timeSeq}</p>
                <p class = "commentPara">openDate : ${boardInfo.openDate}</p>
                <br>
        </c:forEach>
    </div>
    <div id="board" class="bg-info">
    	<c:forEach var="boardInfo" items="${boardDateList}" begin="0" end="${fn:length(boardDateList)}" step = "1" varStatus="status">
            <p class = "commentPara">timeSeq : ${boardInfo.timeSeq}</p>
            <p class = "commentPara">openDate: ${boardInfo.openDate}</p>
            <br>
        </c:forEach>
    </div>
</div>
</body>
</html>