<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>로그인</title>
</head>
<body style="margin: 0; padding: 0; font-family: 'Nanum Gothic Coding', monospace; font-size: 20px; background: #F7FBFF;">
    <div class="main" style="margin: 200px 800px;">
    	<form action="" method="post" id='frm'>
	        <div class="idwrapper" style="font-size: 20px; font-weight: 600; width: 300px; height: 44px;">
	            <input type="text" style="width: 100%; height: 78%; border: 2px solid #0C98FD; font-size: 17px;" id="user_id" name="user_id" value="" placeholder="아이디">
	        </div>
	        <div class="pwwrapper" style="font-size: 20px; font-weight: 600; width: 300px; height: 44px;">
	            <input type="password" style="width: 100%; height: 78%; border: 2px solid #0C98FD; font-size: 17px;" id="user_pw" name="user_pw" value="" placeholder="비밀번호">
	        </div>
	        <div class="btnwrapper" style="font-size: 20px; font-weight: 600; width: 300px; height: 44px;">
	            <button type="submit" style="width: 308px; height: 42px; font-size: 18px; font-weight: 600; border: none; background: #0C98FD; color: white; cursor: pointer;">로그인</button>
	        </div>
	    </form>
    </div>
</body>
</html>