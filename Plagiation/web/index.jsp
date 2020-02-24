<%-- 
ToDo:
- add analyzer to session
- imbed image in some html
- maybe have only numbers as labels
- also should be able to download csv file
- session timeout is set to 2 minutes, should have some JS that tells the user

0.02:
- upload, view image and download csv are working

0.01:
- got first version working
- based on @see http://www.tutorialspoint.com/servlets/servlets-file-uploading.htm

Document   : index
Created on : Feb 8, 2014, 9:29:50 PM
Author     : ralph
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plagiation</title>
    </head>
    <body>
        <h1>Plagiation</h1>
        <h3>File Upload:</h3>
        Select a file to upload: <br />
        <form action="UploadServlet" method="post"
              enctype="multipart/form-data">
            <input type="file" name="file" size="50" multiple />
            <br />
            <input type="submit" value="Upload File" />
        </form>        
    </body>
</html>
