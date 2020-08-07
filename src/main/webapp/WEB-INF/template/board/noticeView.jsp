<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page import="net.kanozo.domain.Criteria"%>

<body>
    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <div class="row d-flex mb-2">
                    <!--   이미지 박스 -->
                    <div class="ml-2" style="width: 128px; height: 128px;">
                        <img src="/user/profile/${board.img}}" alt="img" style="width: 128px; height: 128px;" />
                    </div>
                    <div class="col">
                        <h4 class="card-title">${board.title}</h4>
                        <p class="card-text">
                            <span class="badge badge-primary">${board.name}(${board.writer})</span>
                            <span class="badge badge-secondary">LV.[${board.u_level}]</span>
                            <span class="badge badge-warning">작성일: ${board.writeDate}</span>
                        </p>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">${board.content}</div>
                </div>
                <c:if test="${not empty board.fileName}">
                	<a href="${pageContext.request.contextPath}/upload/${board.fileName}" download>${board.fileName}</a>
                </c:if>  
            </div>
        </div>
        
        <div class="row mt-3 mb-5">
            <div class="col-10 offset-1 text-right">
                <c:if test="${sessionScope.user != null and sessionScope.user.userid == board.writer}">
                    <a href="/notice/write/${board.id}" class="btn btn-success">수정</a>
                    <a href="/notice/noticeDelete/${board.id}" class="btn btn-danger">삭제</a>
                </c:if>
                <a href="/notice/noticeList${criteria.getQuery(criteria.page)}" class="btn btn-primary">목록보기</a>
            </div>
        </div>

      <%--   <c:forEach var="list" items="${list}">
            <div class="col-10 offset-1">
                <div class="row d-flex mb-2">
                    <!--   이미지 박스 -->
                    <div class="ml-2" style="width: 64px; height: 64px;">
                        <img src="/user/profile/${board.img}" alt="profileImg" style="width: 64px; height: 64px;" />
                    </div>
                    <div class="col">
                        <h5 class="card-title">${list.comContent}</h5>
                        <p class="card-text">
                            <span class="badge badge-primary">${board.name} ( ${board.writer} )</span> 
                            <span class="badge badge-secondary">LV.[ ${board.u_level} ]</span>
                            <fmt:parseDate value="${board.writeDate}" var="writeDate" pattern="yyyy-MM-dd" />
                            <span class="badge badge-warning">작성일: <fmt:formatDate value="${writeDate}" pattern="yyyy-MM-dd" /></span>
                        </p>
                    </div>
                </div>
            </div>
            
        </c:forEach> --%>

     <%--    <c:if test="${sessionScope.user != null}">
            <div class="row mt-3">
                <div class="col-10 offset-1">
                    <div class="row d-flex mb-2">
                        <!--   이미지 박스 -->
                        <div class="ml-2" style="width: 64px; height: 64px;">
                            <img src="/user/profile/${board.img}}" alt="boardImg" style="width: 64px; height: 64px;" />
                        </div>
                        <div class="ml-3 form-group">
                            <form method="post" action="/board/replyInsert" name="commentInsertForm">
                                <input type="hidden" name="bno" value="${board.id}" /> 
                                <input type="hidden" name="comWriter" value="${user.userid}" /> 
                                <input type="hidden" name="userName" value="${user.name}" />
                                <textarea class="form-control" rows="3" cols="10" name="comContent" id="comContent"></textarea>
                                <button class="mt-3 btn btn-primary" type="submit" name="commentInsertBtn">등록</button>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </c:if> --%>
    </div>
</body> 