package com.example.AtividadeGraphQL.ForumData;

 record Post(String Id, String content) {

}

 record Comment(String id, String content, String postId) {
	
}