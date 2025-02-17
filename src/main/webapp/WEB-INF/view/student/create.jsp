<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
            <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
                <html>

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport"
                        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
                    <meta http-equiv="X-UA-Compatible" content="ie=edge">
                    <title>Create user</title>
                    <!-- Latest compiled and minified CSS -->
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
                        rel="stylesheet">
                    <!-- Latest compiled JavaScript -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
                    <link href="/css/styles.css" rel="stylesheet" />

                    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

                </head>



                <div class="mt-5">
                    <div class="row">
                        <div class="col-md-6 col-12 mx-auto">
                            <h3>Create a user</h3>
                            <hr />
                            <form:form method="post" action="/student/create" modelAttribute="newUser" class="row"
                                enctype="multipart/form-data">

                                <div class="mb-3 col-12 col-md-6">

                                    <label class="form-label">soCMND:</label>
                                    <form:input type="password" class="form-control " path="soCMND" />
                                    <form:errors path="soCMND" style="color: red;" cssClass="error" />

                                </div>
                                <div class="mb-3 col-12 col-md-6">
                                    <label class="form-label">Ho Ten:</label>
                                    <form:input type="text" class="form-control" path="hoTen" />
                                </div>
                                <div class="mb-3 col-12 col-md-6">

                                    <label class="form-label">Email:</label>
                                    <form:input type="text" class="form-control " path="email" />

                                </div>
                                <div class="mb-3 col-12 col-md-6">

                                    <label class="form-label">So DT:</label>
                                    <form:input type="number" class="form-control" path="soDT" />

                                </div>
                                <div class="mb-3 col-12 col-md-6">
                                    <label class="form-label">Ma Truong</label>
                                    <form:select class="form-select" path="maTruong">
                                        <form:option value="1">1</form:option>
                                        <form:option value="2">2</form:option>
                                    </form:select>
                                    <form:errors path="maTruong" style="color: red;" cssClass="error" />

                                </div>
                                <div class="mb-3 col-12 col-md-6">
                                    <label class="form-label">Ma Nganh:</label>
                                    <form:select class="form-select" path="maNganh">
                                        <form:option value="1">1</form:option>
                                        <form:option value="2">2</form:option>
                                    </form:select>
                                    <form:errors path="maNganh" style="color: red;" cssClass="error" />

                                </div>
                                <div class="mb-3 col-12">
                                    <label class="form-label">He Tot Nghiep:</label>
                                    <form:input type="text" class="form-control" path="heTN" />
                                </div>
                                <div class="mb-3 col-12">
                                    <label class="form-label">Ngay Tot Nghiep:</label>
                                    <form:input type="date" class="form-control" path="ngayTN" />
                                    <form:errors path="ngayTN" style="color: red;" cssClass="error" />
                                </div>
                                <div class="mb-3 col-12">
                                    <label class="form-label">Loai Tot Nghiep:</label>
                                    <form:input type="text" class="form-control" path="loaiTN" />
                                </div>


                                <div class="col-12 mb-5">
                                    <button type="submit"
                                        class="btn btn-primary d-flex justify-content-center align-center">Create</button>
                                </div>
                            </form:form>

                        </div>

                    </div>
                </div>

                </body>

                </html>