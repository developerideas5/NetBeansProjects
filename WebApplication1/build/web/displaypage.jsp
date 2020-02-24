<%-- 
    Document   : displaypage
    Created on : Apr 25, 2014, 4:02:18 PM
    Author     : chinnu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@ page import="java.io.*,java.util.*, javax.servlet.*" %>
<html>
  <head>
    <meta content="text/html; charset=windows-1252" http-equiv="content-type">
    <title>Home page</title>
  </head>
<body>
<center>

</center>
<%
   Date date = new Date();
   out.print( "<h2 align=\"center\">" +date.toString()+"</h2>");
%>
  <body style="  background-color: #FF8000">
    <h1> <span style="font-weight: bold;"></span><span style="font-family: monospace;"></span><span

        style="font-weight: bold; font-style: italic;"></span></h1>
    <h1> </h1>
    <h1><span style="font-weight: bold; font-style: italic;">&nbsp; </span><b style="mso-bidi-font-weight:normal"><i

          style="mso-bidi-font-style:
normal"><span style="font-size:72.0pt;line-height:115%;font-family:Algerian;
color:#FFF000">HOF CAKES&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span></i></b> ☏
      9999900000&nbsp; <span style="color: white;">24x7 Call us</span>
    </h1>
    
    <span style="text-decoration: underline; font-weight: bold; font-style: italic; color: white;">Hof
      Cakes,Enoch Widman Strasse,20 A,Hof,Bavaria,Germany,95028.email id:
      hofcakes@live.de </span><span style="font-weight: bold; font-style: italic;"><span

        style="color: white;">&nbsp;</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <span style="color: rgb(68, 68, 68); font-family: Georgia, 'Times New Roman', Times, serif; font-size: 14px; font-style: normal; font-variant: normal; font-weight: normal; letter-spacing: normal; line-height: 30px; orphans: auto; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: auto; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); display: inline !important; float: none;"></span>
      <p class="MsoNormal"><span style="font-weight: bold; font-style: italic;"></span>
    <span style="font-weight: bold; font-style: italic;">
      <p class="MsoNormal">&nbsp;&nbsp;&nbsp;&nbsp;
        </p>
    </span>
          <p class="MsoNormal"><span style="font-size:20.0pt;line-height:115%;font-family:
Algerian;color:white;mso-themecolor:background1">Welcome to the Hof Cakes Enjoy
        the Taste </span></p>
    <marquee behavior="scroll" direction="left">Yummy Yummy Tasty Delicious Cakes are waiting for you hurry up ...!!!!!! Follow us in the twitter </marquee>
    
    <head>
    <center>
<title>Follow us on </title>
    </center>
<style>
.twitter-btn {
  font: normal normal normal 13px/26px 'Helvetica Neue',Arial,sans-serif;
	height: 28px;
	border-radius: 4px;
	max-width: 100%;
	box-sizing: border-box;
	position: relative;
	background-color: #F8F8F8;
 
	background-image: -webkit-gradient(linear,right top,right bottom,from(#FFF),to(#DEDEDE));
	background-image: -moz-linear-gradient(top,#FFF,#DEDEDE);
	background-image: -o-linear-gradient(top,#FFF,#DEDEDE);
	background-image: -ms-linear-gradient(top,#FFF,#DEDEDE);
	background-image: linear-gradient(top,#FFF,#DEDEDE);
	border: #CCC solid 1px;
	color: #333;
	font-weight: bold;
	text-shadow: 0 1px 0 rgba(255, 255, 255, .5);
	-webkit-user-select: none;
	-moz-user-select: none;
	-o-user-select: none;
	user-select: none;
	cursor: pointer;
	overflow: hidden;
	display: inline-block;
	vertical-align: top;
	zoom: 1;
	text-decoration: none;
}
 
.twitter-btn:hover {
	text-decoration: none;
}
 
.twitter-btn i {
	width: 21px;
	height: 16px;
	left: 4px;
	margin-top: -6px;
	position: absolute;
	top: 50%;
	background: rgba(0, 0, 0, 0) url(data:image/png;base64,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) 0 0 no-repeat;
	background-position: -24px 0;
}
 
.twitter-btn .label {
	padding: 0 7px 0 29px;
	white-space: nowrap;
}
</style>
 
<a target="_blank" class="twitter-btn" title="Follow us and give your valuable feed back in the twitter account @sravanchinnu on Twitter" href="https://twitter.com/sravanchinnu">
	<i></i>
	<span class="label">@sravanchinnu</span>
</a>
    
    <br>
     <br>
      <br>
    <table style="width: 677px; height: 174px;" border="1">
      <tbody>
        <tr>
          <td style="height: 80px; background-color: #FFFF00;"><span style="font-weight: bold;">Fruit
              Cake <br>
              <br>
              <br>
              
              
            <img src="<%=request.getContextPath()%>/image/fruitcake.jpg"> <br>
              
              
              for more details </span><span style="font-weight: bold;"><span style="font-weight: bold;"><a

                  For more details  <a href='fruitcake.jsp'>Click here!</a> <br> </a> </span> </span><br>
      <blink>Select the flavour </blink>
<select autofocus>
  
  <option value="pinapple" selected="selected"></option>
  <option value="pinapple">pineapple</option>
  <option value="strawberry">strawberry</option>
  <option value="mango">mango</option>
  <option value="venela">vanilla</option>
</select>
      
      <br>
      <br>
      <br>
      
                  <form target="paypal" action="NGAEWP367NNSDXP2" method="post" <input=""

                name="business" value="NGAEWP367NNSDXP2" type="hidden"> <input

                  name="cmd" value="_cart" type="hidden"> <input name="add" value="1"

                  type="hidden"> <input name="item_name" value="Birthday - Cake and Candle"

                  type="hidden"> <input name="amount" value="3.95" type="hidden">
                <input name="currency_code" value="USD" type="hidden"> <input name="submit"

                  src="https://www.paypal.com/en_US/i/btn/btn_cart_LG.gif" alt="PayPal - The safer, easier way to pay online"

                  border="0" type="image"> <img alt="" src="https://www.paypal.com/en_US/i/scr/pixel.gif"

                  border="0" height="1" width="1"> </form>
          <td style="background-color: #F7819F;"><span style="font-weight: bold;">Birthday
              Special Designed cake<br>
              <br>
              <br>
              
             <img src="<%=request.getContextPath()%>/image/birthdayc.jpg"> <br>
             
             For more details  <a href='birthdaycake.jsp'>Click here! </a> <br> </a> </span><br>
            <blink>Select the flavour </blink>
<select autofocus>
  
 <option value="pinapple" selected="selected"></option> 
 <option value="pinapple">pineapple</option>
  <option value="strawberry">strawberry</option>
  <option value="mango">mango</option>
  <option value="venela">vanilla</option>
</select>
            <br>
            <br>
            <br>
             <form target="paypal" action="NGAEWP367NNSDXP2" method="post" <input=""

                name="business" value="NGAEWP367NNSDXP2" type="hidden"> <input

                  name="cmd" value="_cart" type="hidden"> <input name="add" value="1"

                  type="hidden"> <input name="item_name" value="Birthday - Cake and Candle"

                  type="hidden"> <input name="amount" value="3.95" type="hidden">
                <input name="currency_code" value="USD" type="hidden"> <input name="submit"

                  src="https://www.paypal.com/en_US/i/btn/btn_cart_LG.gif" alt="PayPal - The safer, easier way to pay online"

                  border="0" type="image"> <img alt="" src="https://www.paypal.com/en_US/i/scr/pixel.gif"

                  border="0" height="1" width="1"> </form></td>
        </tr>
        <tr>
          <td style="background-color: #F7819F;"><span style="font-weight: bold;">EggLess Cake
                  <br>
                  <br>
                  <br>
              
              
               
              
             <img src="<%=request.getContextPath()%>/image/EgglessFruitCake.jpg"> <br>
             
              For more details  <a href='blackforest.jsp'>Click here! </a> <br></a> </span><br>
            <blink>Select the flavour </blink>
<select autofocus>
  
    <option value="pinapple" selected="selected"></option> 
 <option value="pinapple">pineapple</option>
  <option value="strawberry">strawberry</option>
  <option value="mango">mango</option>
  <option value="venela">vanilla</option>
  
  
  
</select>
             <br>
             <br>
             <br>
             <form target="paypal" action="NGAEWP367NNSDXP2" method="post" <input=""

                name="business" value="NGAEWP367NNSDXP2" type="hidden"> <input

                  name="cmd" value="_cart" type="hidden"> <input name="add" value="1"

                  type="hidden"> <input name="item_name" value="Birthday - Cake and Candle"

                  type="hidden"> <input name="amount" value="3.95" type="hidden">
                <input name="currency_code" value="USD" type="hidden"> <input name="submit"

                  src="https://www.paypal.com/en_US/i/btn/btn_cart_LG.gif" alt="PayPal - The safer, easier way to pay online"

                  border="0" type="image"> <img alt="" src="https://www.paypal.com/en_US/i/scr/pixel.gif"

                  border="0" height="1" width="1"> </form><br>
          </td>
          <td style="background-color: #ffff00;"><span style="font-weight: bold;">dry
              fruit cake<br>
              <br>
              <br>
              <img src="<%=request.getContextPath()%>/image/dry-fruit-cake.jpg"> <br>
              
              For more details  <a href='dryfruitcake.jsp'>Click here! </a> <br>
               <blink>Select the flavour </blink>
<select autofocus>
  
  <option value="pinapple" selected="selected"></option>
  <option value="pinapple">pineapple</option>
  <option value="strawberry">strawberry</option>
  <option value="mango">mango</option>
  <option value="venela">vanilla</option>
  
  
  
</select>
              <br>
              <br>
              <br>
               <form target="paypal" action="NGAEWP367NNSDXP2" method="post" <input=""

                name="business" value="NGAEWP367NNSDXP2" type="hidden"> <input

                  name="cmd" value="_cart" type="hidden"> <input name="add" value="1"

                  type="hidden"> <input name="item_name" value="Birthday - Cake and Candle"

                  type="hidden"> <input name="amount" value="3.95" type="hidden">
                <input name="currency_code" value="USD" type="hidden"> <input name="submit"

                  src="https://www.paypal.com/en_US/i/btn/btn_cart_LG.gif" alt="PayPal - The safer, easier way to pay online"

                  border="0" type="image"> <img alt="" src="https://www.paypal.com/en_US/i/scr/pixel.gif"

                  border="0" height="1" width="1"> </form></td>
        </tr>
      </tbody>
    </table>
    <p><br>
    </p>
    
  </body>
</html>
