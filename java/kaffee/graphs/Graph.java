package kaffee.graphs;

import java.util.Set;

/**
 * .
 * @author ahorvath
 */
public class Graph {

	private Set<Edge> edges;
	private Set<Vertex> vertices;

	public void setEdges(Set<Edge> edges) {
		this.edges = edges;
	}

	public void setVertices(Set<Vertex> vertices) {
		this.vertices = vertices;
	}

	public Set<Edge> getEdges() {
		return edges;
	}

	public Set<Vertex> getVertices() {
		return vertices;
	}
}
