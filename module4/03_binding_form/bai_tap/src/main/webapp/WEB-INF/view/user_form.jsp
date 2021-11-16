<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 15/11/2021
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%--String name;--%>
<%--String born;--%>
<%--String gender;--%>
<%--String cmnd;--%>
<%--String vehicle;--%>
<%--String vehicleNumber;--%>
<%--String dateStart;--%>
<%--String dateEnd;--%>
<%--String infor14days;--%>
<%--//địa chỉ liên lạc--%>
<%--String city;--%>
<%--String address;--%>
<%--String phoneNumber;--%>
<%--String email;--%>
<%--//triệu chứng--%>
<%--String sign;--%>
<%--//lịch sử nhiễm bệnh--%>
<%--String situation;--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>THÔNG TIN TỜ KHAI Y TẾ</title>
</head>
<body>
<h1>Thông tin </h1>
<h2>Tên : ${user.name} </h2>
<h2>Năm sinh : ${user.born} </h2>
<h2>Giới tính : ${user.gender} </h2>
<h1>Phương tiện đi lại</h1>
<h2>Phương tiện đi lại : ${user.vehicle} </h2>
<h2>mã số phương tiện : ${user.vehicleNumber} </h2>
<h2>Ngày đi : ${user.dateStart} </h2>
<h2>Ngày kết thúc : ${user.dateEnd} </h2>
<h1>Liên lạc</h1>
<h2>Thông tin đi lại 14 ngày : ${user.infor14days} </h2>
<h2>Thành phố : ${user.city} </h2>
<h2>Địa chỉ : ${user.address} </h2>
<h2>Email : ${user.email} </h2>
<h1>Dấu hiệu</h1>
<h2>Dấu hiệu : ${user.sign} </h2>
<h2>Lịch sử phơi nhiễm : ${user.situation} </h2>
</body>
</html>
