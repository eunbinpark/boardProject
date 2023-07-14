<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
   <script type="text/javascript">
      $(document).ready(function(){
         $('#updatebtn').on('click',function(){
            $('#frm').attr('action','update.do');
            $('#frm').submit();
         });
      });
      
      $(document).ready(function(){
         $('#canclebtn').on('click',function(){
            $('#frm').attr('action','list.do');
            $('#frm').attr('method','get');
            $('#frm').submit();
         });
      });
   </script>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 글쓰기</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Nanum+Gothic+Coding&display=swap" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body style="margin: 0; padding: 0; font-family: 'Nanum Gothic Coding', monospace;">
<form id="frm" method="" action="">
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
    <main style="margin: 150px 200px auto 400px;">
        <h1 style="margin-bottom: 20px; font-weight: 700; margin-left: 57px;">글쓰기</h1>

        <div class="mainwrapper">
            <div class="inputbox" style="width: 1000px; height: 50px; font-size: 18px; font-weight: 600; margin-left: 17px;">
                <span style="margin-left: 18px;">제목 : </span><input type="text" id="title" name="title" placeholder="제목을 입력하세요" value="${poster.title }" style="width: 90%; height: 100%; border: none; border-bottom: 2px solid lightgray;">
            </div>
            <div class="writecontent" style="font-size: 18px; margin-top: 20px; font-weight: 600; margin-left: 17px">
                작성자 : <input type="text" style="border: none;" id="writer" name="author" value="${poster.author}" readonly>
            </div>
            
            <div class="contentbox" style="margin-top: 20px; font-size: 17px; margin-left: 97px;">
                <textarea name="contents" rows="12" cols="97" style="border: 2px solid lightgray;" placeholder="내용을 입력하세요" value="${poster.contents }"></textarea>
            </div>
        </div>
        <div class="btnwrapper" style="text-align: right; margin-right: 330px;">
            <button id="canclebtn" type="button" style="width: 90px; height: 38px; border-radius: 8px; border: none; font-weight: 600;">취소</button>
            <button id="updatebtn" type="button" style="width: 90px; height: 38px; border-radius: 8px; border: none; font-weight: 600; background-color: #0C98FD; color: #fff;">수정</button>
        </div>
    </main>
</form>
</body>

</html>