<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" href="./css/style.css">
</head>
<body>

<div class="inner">
    <div class="outer">
        <form action="add" method="post">
            FullName : <input type="text" name="fullName" id="fullName"> <br><br>
            Email : <input type="email" name="email" id="email"><br><br>
            <button type="submit">Submit</button>
            <button type="reset">Reset</button>
        </form>
    </div>
</div>

</body>
</html>