<%@page import="bitedu.bipa.book.vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-pzvxEtJSIZlkuNQJntrKrAxSFH0FLC1m1z4aDj87g4fuGLuJyTI29aUtqPG8IdpG39CILRGSaQTVZJtwajl8cQ==" crossorigin="anonymous" />

<title>게시판 목록</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
	crossorigin="anonymous"></script>
<style>
.paging {
	list-style: none;
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>
</head>

<<<<<<< HEAD:src/main/webapp/WEB-INF/views/manager/board_search.jsp
<body style="margin: 0; padding: 0; font-family: 'Nanum Gothic Coding', monospace;">
    <!-- 상단 헤더-->
    <header>
        <nav class="navbar navbar-expand-lg bg-dark">
            <div class="container-fluid" style="margin-right: 150px;">
              <div class="collapse navbar-collapse" id="navbarText" style="justify-content: flex-end;">
                <a class="navbar-brand" href="#" style="color: #fff; font-weight: 600;">로그인</a>
                <a class="navbar-brand" href="#" style="color: #fff; font-weight: 600;">회원가입</a>
              </div>
            </div>
          </nav>
    </header>
    <!-- 본문 -->
    <main style="margin: 150px 200px auto 200px;">
        <div class="mainwrapper" style="display: flex; justify-content: space-between;">
            <h1 style="margin-bottom: 20px; font-weight: 700;">자유 게시판</h1>
            <a href="#" style="text-decoration: none; color: black; font-size: 18px; font-weight: 700; margin-top: 30px; margin-right: 100px;">글쓰기</a>
        </div>
        <div class="table-wrapper">
            <table class="table table-hover" style="text-align: center;">
                <thead class="table-secondary">
                    <tr>
                      <th scope="col" style="width: 100px;">순번</th>
                      <th scope="col" style="width: 500px; text-align: left;">제목</th>
                      <th scope="col" style="width: 180px; ">작성자</th>
                      <th scope="col" style="width: 180px; ">작성일</th>
                      <th scope="col" style="width: 100px;">조회수</th>
                    </tr>
                  </thead>
                  <tbody>
                  	<c:forEach var="copy" items="${list}">
                  		<tr>
                  			<td>${copy.posterPk }</td>
                  			<td><a href="detail.do?posterPk=${copy.posterPk}">${copy.title }</a></td>
                  			<td>${copy.author }</td>
                  			<td><fmt:formatDate value="${copy.writeDate}" pattern="yyyy-MM-dd"/> </td>
                  			<td>${copy.viewNum }</td>
                  		</tr>
                  	</c:forEach>
                  		<tr><td colspan="5"><a href="#"><button>등록</button></a></td></tr>
                  	
                  </tbody>
            </table>
        </div>
    </main>
=======
<body
	style="margin: 0; padding: 0; font-family: 'Nanum Gothic Coding', monospace;">
	<!-- 상단 헤더-->
	<header>
		<nav class="navbar navbar-expand-lg bg-dark">
			<div class="container-fluid" style="margin-right: 150px;">
				<div class="collapse navbar-collapse" id="navbarText"
					style="justify-content: flex-end;">
					<a class="navbar-brand" href="#"
						style="color: #fff; font-weight: 600;">로그인</a> <a
						class="navbar-brand" href="#"
						style="color: #fff; font-weight: 600;">회원가입</a>
				</div>
			</div>
		</nav>
	</header>
	<!-- 본문 -->
	<main style="margin: 150px 200px auto 200px;">
		<div class="mainwrapper"
			style="display: flex; justify-content: space-between;">
			<h1 style="margin-bottom: 20px; font-weight: 700;">자유 게시판</h1>
			<a href="#"
				style="text-decoration: none; color: black; font-size: 18px; font-weight: 700; margin-top: 30px; margin-right: 100px;">글쓰기</a>
		</div>
		<div class="table-wrapper">
			<table class="table table-hover" style="text-align: center;">
				<thead class="table-secondary">
					<tr>
						<th scope="col" style="width: 100px;">순번</th>
						<th scope="col" style="width: 500px; text-align: left;">제목</th>
						<th scope="col" style="width: 180px;">작성자</th>
						<th scope="col" style="width: 180px;">작성일</th>
						<th scope="col" style="width: 100px;">조회수</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${list}">
						<tr>
							<td>${list.posterPk}</td>
							<td>${list.title}</td>
							<td>${list.author}</td>
							<td><fmt:formatDate value="${list.write_date}"
									pattern="yyyy-MM-dd" /></td>
							<td>${list.viewNum}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
		<ul class="paging">
			<a th:if="${page.hasFirstPageNav}==true" class="page first"
				th:with="url_first=${form.makeQString(1)}" th:href="@{${url_first}}">
				<i class="fas fa-angle-double-left"></i>
				
			</a>
			<a th:if="${page.hasPreviousPageNav}==true" class="page prev"
				th:with="url_prev=${form.makeQString(page.firstPageNo-1)}"
				th:href="@{${url_prev}}"> <i class="fas fa-angle-left"></i>
				
			</a>
			<c:forEach begin="1" end="${ pagingsize}" var="num">
				<li><a href="./list1.do?pagesize=9&currentpage=${num }">${num }</a></li>
			</c:forEach>
			<a th:if="${page.hasNextPageNav}==true" class="page next"
				th:with="url_next=${form.makeQString(page.lastPageNo + 1)}"
				th:href="@{${url_next}}"> <i class="fas fa-angle-right"></i>
			</a>
			<a th:if="${page.hasLastPageNav}==true" class="page last"
				th:with="url_last=${form.makeQString(page.totalPage)}"
				th:href="@{${url_last}}"> <i class="fas fa-angle-double-right"></i>
			</a>
		</ul>
	</main>
>>>>>>> 05766f665c9df7ebad5708741a3f73052b1cbe3d:src/main/webapp/WEB-INF/views/manager/book_list.jsp

</body>
</html>