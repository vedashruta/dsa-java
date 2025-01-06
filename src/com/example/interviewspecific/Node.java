package com.example.interviewspecific;

import java.util.*;

//[
//{_id:1,parentId:null,name:"A"},
//{_id:2,parentId:1,name:"B"},
//{_id:3,parentId:2,name:"C"},
//{_id:4,parentId:1,name:"D"},
//{_id:5,parentId:2,name:"E"},
//]
//post processing
//{
//id:1,
//children:[	
//{
//_id:2,parentId:1,name:"B",
//children:[
//{_id:3,parentId:2,name:"C"},
//{_id:5,parentId:2,name:"E"}
//]
//},
//{
//_id:4,parentId:1,name:"D"
//},
//]
//}

public class Node{
	int _id;
	Integer parentId;
	String name;
	List<Node> children;
	
	public Node (int _id,int parentId,String name) {
		this._id = _id;
		this.parentId=parentId;
		this.name= name;
		this.children=new ArrayList<>();
	}
}

