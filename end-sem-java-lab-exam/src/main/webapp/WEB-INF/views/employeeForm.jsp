<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Details</h1>
    <form action="/submitEmployee" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>

        <label for="gender">Gender:</label>
        <input type="text" id="gender" name="gender"><br><br>

        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
