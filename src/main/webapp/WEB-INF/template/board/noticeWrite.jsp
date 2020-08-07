<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <c:if test="${empty noticeVO.id}">
                    <h2>글 작성</h2>
                </c:if>

                <c:if test="${not empty noticeVO.id}">
                    <h2>글 수정</h2>
                </c:if>

                <form method="post" action="/notice/write" enctype="multipart/form-data">
                <input type="hidden" value="${noticeVO.id}" name="id" />
                    <div class="form-group">
                        <label for="title">글 제목</label> <input type="text" class="form-control" name="title" id="title" value="${noticeVO.title}"
                            placeholder="글 제목을 입력하세요">
                        <div class="invalid-feedback">글 제목에 오류가 있을 때 보여줄 메시지</div>
                    </div>

                    <div class="form-group">
                        <textarea class="form-control" id="content" name="content" placeholder="글 내용을 입력하세요">${noticeVO.content}</textarea>
                        <div class="invalid-feedback">글 내용 관련 오류가 있을 때 보여줄 메시지</div>
                    </div>
                    
                    <input type="file" name="file">

                    <button type="submit" class="btn btn-primary">글작성</button>
                </form>
            </div>
        </div>
    </div>
</body>