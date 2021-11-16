<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: WIN-PRO
  Date: 11/11/2021
  Time: 08:41
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
    <title>TỜ KHAI Y TẾ</title>
</head>
<body>
<div style="text-align: center">
    <h1>TỜ KHAI Y TẾ </h1>
    <h2>TÀI LIỆU QUAN TRỌNG THÔNG TIN CỦA ANH CHỊ SẼ GIÚP CƠ QUAN Y TUẾ LIÊN LKAJC PHÒNG CHỐNG</h2>
    <h2 style="color:brown;">Khuyến cáo : Khai báo thông tin sai bạn có thể đi tù</h2><br>
</div>
<%--@elvariable id="user" type="codegym"--%>
<form:form method="post" action="user_form" modelAttribute="user">
    <h4>Họ tên(ghi chữ in hoa)*</h4>
    <form:input path="name"/>
    <h4>Năm sinh</h4>
    <form:input path="born"/>
    <h4>Giới tính</h4>
    <form:select path="gender" items="${gender}"/>
    <h4>Số chứng mình nhân dân</h4>
    <form:input path="cmnd"/>
    <h4>Thông tin đi lại</h4>
    <form:checkboxes path="vehicle" items="${vehicle}"/>
    <h4>Số hiệu phương tiện</h4>
    <form:input path="vehicleNumber"/>
    <h4>Ngày khởi hành</h4>
    <form:input path="dateStart" type="date"/>
    <h4>Ngày kết thúc</h4>
    <form:input path="dateEnd" type="date"/>
    <h4>Trong vòng 14 ngày qua,Anh/Chị đi đến những địa điểm nào ?</h4>
    <form:textarea path="infor14days"/>
    <h2>Địa chỉ liên lạc</h2>
    <p>Tỉnh/thành</p>
    <form:select path="city" items="${city}"/>
    <h4>Địa chỉ nơi ở </h4>
    <form:textarea path="address"/>
    <h4>Điện thoại</h4>
    <form:input path="phoneNumber" type="number"/>
    <h4>Email</h4>
    <form:input path="email"/>
    <h2>Trong 14 ngày qua anh/chị có xuất hiện dấu hiện nào sau đây không ? </h2>
    <table border="1px" style="width: 100%; height: 300px">
        <tr>
            <td>Triệu chứng</td>
            <td>Có</td>
            <td>Không</td>
        </tr>
        <tr>
            <td>Sốt</td>
            <td colspan="2" style="text-align: center"><form:checkbox value="SOT" path="sign" items="${sign}"/></td>
        </tr>
        <tr>
            <td>Tiêu chảy</td>
            <td colspan="2" style="text-align: center"><form:checkbox value="TIEU CHAY" path="sign" items="${sign}"/></td>
        </tr>
        <tr>
            <td>Đau bụng</td>
            <td colspan="2" style="text-align: center"><form:checkbox value="Dau BUNG" path="sign" items="${sign}"/></td>
        </tr>
        <tr>
            <td>Buồn nôn</td>
            <td colspan="2" style="text-align: center"><form:checkbox value="BUON NON" path="sign" items="${sign}"/></td>
        </tr>
        <tr>
            <td>Ho</td>
            <td colspan="2" style="text-align: center"><form:checkbox value="Ho" path="sign" items="${sign}"/></td>
        </tr>
        </td>
        </tr>
    </table>


    <h4>Lịch sử phơi nhiễm : trong vòng 14 ngày qua, anh/chị có </h4>
    <table border="1px" solid style="color: blueviolet; height: auto; width: 100%">
        <tr>
            <td></td>
            <td>Có</td>
            <td>Không</td>
        </tr>
        <tr>
            <td>Đến trang trại chăn nuôi/ chợ buôn bán vật sống /v,v,v,</td>
            <td><form:radiobuttons path="situation" items="${situation}"/></td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh covid</td>
            <td><form:radiobuttons path="situation" items="${situation}"/></td>
        </tr>
    </table>
    <h2 style="color: red">Dữ liệu bạn cung cấp hoàn toàn bảo mật và phục vụ cho việc phòng chống dịch
        ,thuốc quản lý khi bạn nhấn gửi tức bạn đã hiểu và đồng ý </h2>
    <br>
    <button style="background: greenyellow; width: 100px  ; height:100px ;margin-left: 200px" type="submit">GỬI TỜ KHAI
    </button>
</form:form>
</body>
</html>
