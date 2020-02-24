<%--
 * IdeaCrafting - An Online-Idea-Managment-Tool
 * Copyright (C) 2012-2013 Ralph P. Lano
 *
 * Licensed under the terms of the GNU Lesser General Public License:
 * 		http://www.opensource.org/licenses/lgpl-license.php
 *
 * For further information visit:
 * 		http://www.ideacrafting.org/
 *
 * File Name: index.jsp
 * 	This is the main page.  It displays menu and navigation, and also
 *      depending on incomming action request decides what to do.
 * ToDo:
 * - we could store the keywords and ideaBits in the session, then different
 *   users would see their own.  Problem, session timeout!
 * - to solve the session timeout problem do a auto-refresh that sends to a page with the IdeaBits.txt file contents
 * - could there be a hierarchical relationship that could also work for JSPVorlesungen?
 * - make keywords all small letters
 * - we need to add search capabilities
 * - when saving there should be version and date information
 * - there should be one root element, all others are children, links are allowed, if there is no parent, root will be automatic parent
 *
 * Version:  0.4
 * Modified: 2013-01-01
 *
 * History:
 * - 0.4: changed name to IdeaCrafting
 * - turn save.jsp into a servlet (see http://stackoverflow.com/questions/1776142/getoutputstream-has-already-been-called-for-this-response)
 * - for navigation use a text file, the user can edit, that mimics the hierarchy
 * - for the menu we need to add a safety that checks if keyword exists
 * - 0.3: added save and upload functionality
 * - if info bits are empty they should not be printed
 * - 0.2: got rid of file ideas.txt, initially all info is stored under special keyword "_new"
 * - 0.1: started initial version, added UTF-8 support
 *
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>       
        <tr>
            <td style="width: 100px; vertical-align: top;" >
<%@include file="navigation.jsp" %>                
          </td>
          <td style="text-align: left; vertical-align: top;"> 
<%
        request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
	String sAction = request.getParameter("action");   
        if ( ( sAction != null ) && ( sAction.equals("Classify") ) ) {
%>
            <%@include file="listInfoBitsForClassification.jsp" %>                
<%
        } else if ( ( sAction != null ) && ( sAction.equals("listAllInfoBits") ) ) {
%>
            <%@include file="listAllInfoBits.jsp" %>                
<%
        } else if ( ( sAction != null ) && ( sAction.equals("listAllKeywords") ) ) {
%>
            <%@include file="listAllKeywords.jsp" %>                 
<%
        } else if ( ( sAction != null ) && ( sAction.equals("editNavigation") ) ) {
%>
            <%@include file="navigationEdit.jsp" %>              
<%
        } else if ( ( sAction != null ) && ( sAction.equals("load") ) ) {
%>
            <%@include file="load.jsp" %>                
<%
        } else {
%>
            <%@include file="listInfoBits.jsp" %>                
<%
        }
%>        
           </td>        
        </tr>
        
<%@include file="footer.jsp" %>       
        