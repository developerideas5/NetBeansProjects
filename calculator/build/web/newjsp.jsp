<%-- 
    Document   : newjsp
    Created on : May 1, 2014, 8:41:24 PM
    Author     : shruti
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="Gray">  
   <center>
        <h1>Calculator</h1>
   
        <form name="Calc">
          <table border=4 bordercolorlight="#FF9900" bordercolordark="#FF6633">
            <tr> 
              <td> 
                <div align="center"> <font size="+1"> 
                  <input type="text"   name="Input" size="16">
                  </font></div>
              </td>
            </tr>
            <tr> 
              <td height="111"> 
                <div align="center"> 
                  <input type="button" name="one"   value="  1  " onClick="Calc.Input.value += '1'">
                  <input type="button" name="two"   value="  2  " onClick="Calc.Input.value += '2'">
                  <input type="button" name="three" value="  3  " onClick="Calc.Input.value += '3'">
                  <input type="button" name="plus"  value="  +  " onClick="Calc.Input.value += ' + '">
                  <br>
                  <input type="button" name="four"  value="  4  " onClick="Calc.Input.value += '4'">
                  <input type="button" name="five"  value="  5  " onClick="Calc.Input.value += '5'">
                  <input type="button" name="six"   value="  6  " onClick="Calc.Input.value += '6'">
                  <input type="button" name="minus" value="   -  " onClick="Calc.Input.value += ' - '">
                  <br>
                  <input type="button" name="seven" value="  7  " onClick="Calc.Input.value += '7'">
                  <input type="button" name="eight" value="  8  " onClick="Calc.Input.value += '8'">
                  <input type="button" name="nine"  value="  9  " onClick="Calc.Input.value += '9'">
                  <input type="button" name="times" value="  x  " onClick="Calc.Input.value += ' * '">
                  <br>
                  <input type="button" name="clear" value="  Clear " onClick="Calc.Input.value = ''">
                  <input type="button" name="zero"  value="  0  " onClick="Calc.Input.value += '0'">
                  <input type="button" name="div"   value="   /  " onClick="Calc.Input.value += ' / '">
                </div>
              </td>
            </tr>
            <tr> 
              <td> 
                <div align="center"> 
                  <input type="button" name="DoIt"  value="             =             " onClick="Calc.Input.value = eval(Calc.Input.value)">
                </div>
              </td>
            </tr>
          </table>
          
          <div align="right"><br>
		</div>
         
        </form>
      </center>

    </body>
</html>
