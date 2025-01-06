package com.example.interviewspecific;
import java.util.*;

import com.example.interviewspecific.Node;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> input = Arrays.asList(
				Map.of("_id",1,"parentId",0,"name","A"),
	            Map.of("_id", 2, "parentId", 1, "name", "B"),
	            Map.of("_id", 3, "parentId", 2, "name", "C"),
	            Map.of("_id", 4, "parentId", 1, "name", "D"),
	            Map.of("_id", 5, "parentId", 2, "name", "E")
	            );
		Map<Integer,Node>nodeMap = new HashMap<>();
		Node root = null;
		for(Map<String,Object>entry:input) {
			int id = (int)entry.get("_id");
			int parentId = (Integer)entry.get("parentId");
			String name = (String)entry.get("name");
			
			Node node = new Node(id, parentId, name);
			nodeMap.put(id, node);
			
			if (parentId==0) {
				root = node;
			}
			else {
				Node parentNode = nodeMap.get(parentId);
				parentNode.children.add(node);
			}
			
		}
		System.out.println("Root: " + root.name);
        printNode(root, 1);
	}
	
	private static void printNode(Node node, int indent) {
        System.out.println("  ".repeat(indent) + "Node: " + node._id + " Name: " + node.name + " ParentId: " + node.parentId);
        for (Node child : node.children) {
            printNode(child, indent + 1);
        }
    }

}
