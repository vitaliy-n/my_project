<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<h1>users</h1>

<table>
    <tr>
        <th>id</th>
        <th>first name</th>
        <th>password</th>
        <th>bank roll</th>
        <th>edit</th>
        <th>delete</th>
    </tr>
    <#list users as user >
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.bank_roll}</td>
            <td><a href="/edit/${user.id}">edit</a></td>
            <td><a href="/remove/${user.id}">delete</a></td>


        </tr>
    </#list>



</table>
<a href="../../index.html">main</a>
</body>
</html>