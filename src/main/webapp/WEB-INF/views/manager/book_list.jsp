<%@page import="bitedu.bipa.book.vo.BookCopy"%>
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
    <title>게시판 목록</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>

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
                    <tr>
                      <th scope="row">1</th>
                      <td style="text-align: left;">게시판1</td>
                      <td>홍길동</td>
                      <td>23.07.11</td>
                      <td>13</td>
                    </tr>
                    <tr>
                      <th scope="row">2</th>
                      <td style="text-align: left;">게시판2</td>
                      <td>홍길동</td>
                      <td>23.07.12</td>
                      <td>27</td>
                    </tr>
                    <tr>
                        <th scope="row">3</th>
                        <td style="text-align: left;">게시판3</td>
                        <td>홍길동</td>
                        <td>23.07.13</td>
                        <td>16</td>
                    </tr>
                    <tr>
                        <th scope="row">4</th>
                        <td style="text-align: left;">게시판4</td>
                        <td>홍길동</td>
                        <td>23.07.18</td>
                        <td>14</td>
                    </tr>
                    <tr>
                        <th scope="row">5</th>
                        <td style="text-align: left;">게시판5</td>
                        <td>홍길동</td>
                        <td>23.07.20</td>
                        <td>6</td>
                    </tr>
                    <tr>
                        <th scope="row">6</th>
                        <td style="text-align: left;">게시판6</td>
                        <td>홍길동</td>
                        <td>23.07.23</td>
                        <td>25</td>
                    </tr>
                    <tr>
                        <th scope="row">7</th>
                        <td style="text-align: left;">게시판7</td>
                        <td>홍길동</td>
                        <td>23.07.18</td>
                        <td>14</td>
                    </tr>
                    <tr>
                        <th scope="row">8</th>
                        <td style="text-align: left;">게시판8</td>
                        <td>홍길동</td>
                        <td>23.07.20</td>
                        <td>6</td>
                    </tr>
                    <tr>
                        <th scope="row">9</th>
                        <td style="text-align: left;">게시판9</td>
                        <td>홍길동</td>
                        <td>23.07.23</td>
                        <td>25</td>
                    </tr>
                  </tbody>
            </table>
        </div>
    </main>

</body>
</html>