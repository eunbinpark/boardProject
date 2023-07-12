<%@page import="bitedu.bipa.book.utils.DateCalculation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상세보기</title>
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
    <main style="margin: 100px 200px auto 400px;">
        <h2 style="margin-bottom: 20px; font-weight: 700; margin-left: 15px;">글 제목</h2>
        <div class="content" style="display: block;">
          <div class="writecontent" style="font-size: 18px; margin-top: -16px; font-weight: 600; margin-left: 17px">
            <span>작성자 : </span><input type="text" style="border: none;" id="writer" name="writer" value="작성자">
          </div>
          <div class="writecontent" style="font-size: 18px; font-weight: 600; margin-left: 17px">
            <span>작성일 : </span><input type="text" style="border: none;" id="regdate" name="regdate" value="2023-07-12">
          </div>
          <div class="writecontent" style="font-size: 18px; font-weight: 600; margin-left: 17px; display: flex;">
            조회수 : <input type="text" style="border: none; margin-left: 9px; width: 755px;" id="viewcount" name="viewcount" value="40">
            <div class="thumbs" style="display: flex;">
              <div class="up" style="display: flex;">
                <svg xmlns="http://www.w3.org/2000/svg" height="1.5em" viewBox="0 0 512 512"><path style="fill: blue;" d="M323.8 34.8c-38.2-10.9-78.1 11.2-89 49.4l-5.7 20c-3.7 13-10.4 25-19.5 35l-51.3 56.4c-8.9 9.8-8.2 25 1.6 33.9s25 8.2 33.9-1.6l51.3-56.4c14.1-15.5 24.4-34 30.1-54.1l5.7-20c3.6-12.7 16.9-20.1 29.7-16.5s20.1 16.9 16.5 29.7l-5.7 20c-5.7 19.9-14.7 38.7-26.6 55.5c-5.2 7.3-5.8 16.9-1.7 24.9s12.3 13 21.3 13L448 224c8.8 0 16 7.2 16 16c0 6.8-4.3 12.7-10.4 15c-7.4 2.8-13 9-14.9 16.7s.1 15.8 5.3 21.7c2.5 2.8 4 6.5 4 10.6c0 7.8-5.6 14.3-13 15.7c-8.2 1.6-15.1 7.3-18 15.1s-1.6 16.7 3.6 23.3c2.1 2.7 3.4 6.1 3.4 9.9c0 6.7-4.2 12.6-10.2 14.9c-11.5 4.5-17.7 16.9-14.4 28.8c.4 1.3 .6 2.8 .6 4.3c0 8.8-7.2 16-16 16H286.5c-12.6 0-25-3.7-35.5-10.7l-61.7-41.1c-11-7.4-25.9-4.4-33.3 6.7s-4.4 25.9 6.7 33.3l61.7 41.1c18.4 12.3 40 18.8 62.1 18.8H384c34.7 0 62.9-27.6 64-62c14.6-11.7 24-29.7 24-50c0-4.5-.5-8.8-1.3-13c15.4-11.7 25.3-30.2 25.3-51c0-6.5-1-12.8-2.8-18.7C504.8 273.7 512 257.7 512 240c0-35.3-28.6-64-64-64l-92.3 0c4.7-10.4 8.7-21.2 11.8-32.2l5.7-20c10.9-38.2-11.2-78.1-49.4-89zM32 192c-17.7 0-32 14.3-32 32V448c0 17.7 14.3 32 32 32H96c17.7 0 32-14.3 32-32V224c0-17.7-14.3-32-32-32H32z"/></svg>
                <input type="text" style="border: none; width: 47px; height: 29px; font-weight: 600; color: blue; font-size: 23px;" id="like" name="like" value="2">
              </div>
              <div class="down" style="display: flex;">
                <svg xmlns="http://www.w3.org/2000/svg" height="1.5em" viewBox="0 0 512 512"><path style="fill: red;" d="M323.8 477.2c-38.2 10.9-78.1-11.2-89-49.4l-5.7-20c-3.7-13-10.4-25-19.5-35l-51.3-56.4c-8.9-9.8-8.2-25 1.6-33.9s25-8.2 33.9 1.6l51.3 56.4c14.1 15.5 24.4 34 30.1 54.1l5.7 20c3.6 12.7 16.9 20.1 29.7 16.5s20.1-16.9 16.5-29.7l-5.7-20c-5.7-19.9-14.7-38.7-26.6-55.5c-5.2-7.3-5.8-16.9-1.7-24.9s12.3-13 21.3-13L448 288c8.8 0 16-7.2 16-16c0-6.8-4.3-12.7-10.4-15c-7.4-2.8-13-9-14.9-16.7s.1-15.8 5.3-21.7c2.5-2.8 4-6.5 4-10.6c0-7.8-5.6-14.3-13-15.7c-8.2-1.6-15.1-7.3-18-15.2s-1.6-16.7 3.6-23.3c2.1-2.7 3.4-6.1 3.4-9.9c0-6.7-4.2-12.6-10.2-14.9c-11.5-4.5-17.7-16.9-14.4-28.8c.4-1.3 .6-2.8 .6-4.3c0-8.8-7.2-16-16-16H286.5c-12.6 0-25 3.7-35.5 10.7l-61.7 41.1c-11 7.4-25.9 4.4-33.3-6.7s-4.4-25.9 6.7-33.3l61.7-41.1c18.4-12.3 40-18.8 62.1-18.8H384c34.7 0 62.9 27.6 64 62c14.6 11.7 24 29.7 24 50c0 4.5-.5 8.8-1.3 13c15.4 11.7 25.3 30.2 25.3 51c0 6.5-1 12.8-2.8 18.7C504.8 238.3 512 254.3 512 272c0 35.3-28.6 64-64 64l-92.3 0c4.7 10.4 8.7 21.2 11.8 32.2l5.7 20c10.9 38.2-11.2 78.1-49.4 89zM32 384c-17.7 0-32-14.3-32-32V128c0-17.7 14.3-32 32-32H96c17.7 0 32 14.3 32 32V352c0 17.7-14.3 32-32 32H32z"/></svg>
                <input type="text" style="border: none; width: 47px; height: 29px; font-weight: 600; color: red; font-size: 23px;" id="dislike" name="dislike" value="5">
              </div>
            </div>
          
          </div>
            
        </div>
        <div class="contentbox" style="margin-top: 20px; font-size: 17px; margin-left: 97px;">
          <textarea rows="12" cols="97" style="border: 2px solid lightgray;">내용을 입력하세요</textarea>
      </div>
        <hr>
        <h3 style="margin-bottom: 20px; font-weight: 700; margin-left: 57px;">댓글</h3>
        <div class="revbox" style="font-size: 17px; margin-left: 97px;">
          <textarea rows="3" cols="97" style="border: 2px solid lightgray;">로그인 후 이용가능합니다.</textarea>
        </div>

        <div class="btnwrapper" style="text-align: right; margin-right: 330px;">
          <button type="button" id="back" style="width: 90px; height: 38px; border-radius: 8px; border: none; font-weight: 600;">취소</button>
          <button type="submit" id="regist" style="width: 90px; height: 38px; border-radius: 8px; border: none; font-weight: 600; background-color: #0C98FD; color: #fff;" >등록</button>
        </div>

    </main>
</body>
</html>