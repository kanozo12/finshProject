<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
	<script src="/app/js/upload.js"></script>

    <div class="container">
        <div class="row">
            <div class="col-10 offset-1">
                <c:if test="${empty boardVO.id}">
                    <h2>글 작성</h2>
                </c:if>

                <c:if test="${not empty boardVO.id}">
                    <h2>글 수정</h2>
                </c:if>
				
                <form method="post" enctype="multipart/form-data" id="uploadForm" name="uploadForm" action="/board/write">
                    <!-- <input type="hidden" th:field="*{id}" /> -->
                    <div class="form-group">
                        <label for="title">글 제목</label> <input type="text" class="form-control" name="title" id="title"
                            placeholder="글 제목을 입력하세요">
                        <div class="invalid-feedback">글 제목에 오류가 있을 때 보여줄 메시지</div>
                    </div>

                    <div class="form-group">
                        <textarea class="form-control" id="content" name="content" placeholder="글 내용을 입력하세요"></textarea>
                        <div class="invalid-feedback">글 내용 관련 오류가 있을 때 보여줄 메시지</div>
                    </div>
                    
                    <div class="form-group">
                    	<table>
		                	<tbody id="fileTableTbody">
					        	<tr>
					            	<td id="dropZone">
					                  	파일을 드래그 하세요
					                </td>
					           	</tr>
					      	</tbody>
			            </table>
                    </div>
                    <a href="javascript:uploadFile();" class="btn btn-primary">글쓰기</a>
                   <button onclick="uploadFile();" class="btn btn-primary">글쓰기</button>

                </form>
            </div>
        </div>
    </div>
    <script src="/webjars/tinymce/4.8.5/tinymce.min.js"></script>
    <script src="/app/js/app.js"></script>
</body>