<%
        request.setCharacterEncoding("UTF-8");      // needed to read umlauts in parameters
        String sNavigation = request.getParameter("navigation");  
        if ( (sNavigation == null) || ( sNavigation.length() == 0 ) ) {
            application.setAttribute("navigation", null);            
        } else {
            application.setAttribute("navigation", sNavigation);                        
        }
        response.sendRedirect("index.jsp");          
%>